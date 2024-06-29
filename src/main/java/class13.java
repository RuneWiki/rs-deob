import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class13 extends class41 {

    @OriginalMember(owner = "mapview!g", name = "w", descriptor = "Lu;")
    public static class38 field125 = class9.method45(-41, "Farming shop");

    @OriginalMember(owner = "mapview!g", name = "v", descriptor = "Lu;")
    public static class38 field124 = class9.method45(-41, "???");

    @OriginalMember(owner = "mapview!g", name = "u", descriptor = "[J")
    public static long[] field123 = new long[32];

    @OriginalMember(owner = "mapview!g", name = "x", descriptor = "Lha;")
    public static class16 field126 = new class16();

    @OriginalMember(owner = "mapview!g", name = "A", descriptor = "Lu;")
    public static class38 field129 = class9.method45(-41, "");

    @OriginalMember(owner = "mapview!g", name = "z", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "mapview!g", name = "y", descriptor = "Lia;")
    public static class18 field127;

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([BZZ)V", line = 10)
    public class13(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(II)Lu;", line = 14)
    public static final class38 method68(int arg0, int arg1) {
        if (arg0 != 10) {
            field127 = (class18) null;
        }
        return class10.method59(false, false, arg1, 10);
    }

    @OriginalMember(owner = "mapview!g", name = "b", descriptor = "(I)V", line = 24)
    public static void method69(int arg0) {
        field126 = null;
        field124 = null;
        if (arg0 != 0) {
            field125 = (class38) null;
        }
        field127 = null;
        field125 = null;
        field129 = null;
        field123 = null;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 43)
    public static final int method70(KeyEvent arg0, int arg1) {
        int var2 = arg0.getKeyChar();
        if (var2 != 8364) {
            if (arg1 != 32) {
                return 120;
            } else {
                if (-1 <= ~var2 || var2 >= 256) {
                    var2 = -1;
                }
                return var2;
            }
        } else {
            return 128;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 91)
    public static final String method71(int arg0, Throwable arg1) throws IOException {
        String var2;
        if (!(arg1 instanceof class23)) {
            var2 = "";
        } else {
            class23 var3 = (class23) arg1;
            var2 = var3.field216 + " | ";
            arg1 = var3.field211;
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        if (arg0 != -13665) {
            return (String) null;
        } else {
            String var6 = var4.toString();
            BufferedReader var7 = new BufferedReader(new StringReader(var6));
            String var8 = var7.readLine();
            while (true) {
                while (true) {
                    String var9 = var7.readLine();
                    if (var9 == null) {
                        return var2 + "| " + var8;
                    }
                    int var10 = var9.indexOf(40);
                    int var11 = var9.indexOf(41, var10 + 1);
                    if (-1 >= ~var10 && 0 <= var11) {
                        String var12 = var9.substring(var10 + 1, var11);
                        int var13 = var12.indexOf(".java:");
                        if (var13 >= 0) {
                            String var14 = var12.substring(0, var13) + var12.substring(var13 - -5);
                            var2 = var2 + var14 + ' ';
                            continue;
                        }
                        var9 = var9.substring(0, var10);
                    }
                    String var15 = var9.trim();
                    String var16 = var15.substring(var15.lastIndexOf(32) - -1);
                    String var17 = var16.substring(1 + var16.lastIndexOf(9));
                    var2 = var2 + var17 + ' ';
                }
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(IZLjava/lang/Object;)[B", line = 161)
    public static final byte[] method72(int arg0, boolean arg1, Object arg2) {
        if (arg2 == null) {
            return null;
        } else {
            if (arg0 != 5) {
                field126 = (class16) null;
            }
            if (arg2 instanceof byte[]) {
                byte[] var3 = (byte[]) ((byte[]) arg2);
                return !arg1 ? var3 : mapview.method139(0, var3);
            } else if (!(arg2 instanceof class10)) {
                throw new IllegalArgumentException();
            } else {
                class10 var4 = (class10) arg2;
                return var4.method56(15552);
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Ljava/io/DataInputStream;ZB)V", line = 201)
    private final void method73(DataInputStream arg0, boolean arg1, byte arg2) throws IOException {
        if (!arg1) {
        }
        int var4 = arg0.read();
        int var5 = arg0.readInt();
        int var6 = var5;
        int var7 = 110 % ((arg2 - -32) / 33);
        if (~var4 != -1) {
            var5 += 4;
        }
        class33 var8 = new class33(var5 + 5);
        var8.method193(var4, 0);
        var8.method182(var6, 255);
        arg0.readFully(var8.field429, var8.field427, var5);
        this.method264((byte) 110, var8.field429);
        for (int var9 = 0; ~super.field524 < ~var9; ++var9) {
            int var10 = arg0.read();
            int var11 = arg0.readInt();
            int var12 = var11;
            if (var10 != 0) {
                var11 += 4;
            }
            class33 var13 = new class33(var11 + 5);
            var13.method193(var10, 0);
            var13.method182(var12, 255);
            while (33554432 < var11) {
                arg0.readFully(var13.field429, var13.field427, 33554432);
                var11 -= 33554432;
                var13.field427 += 33554432;
            }
            arg0.readFully(var13.field429, var13.field427, var11);
            if (super.field513) {
                super.field516[super.field519[var9]] = var13.field429;
            } else {
                super.field516[super.field519[var9]] = class39.method247(-67, var13.field429, false);
            }
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "([BZZZ)V", line = 261)
    private class13(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method73(new DataInputStream(new ByteArrayInputStream(arg0)), arg3, (byte) -104);
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(B)I", line = 275)
    public static final int method74(byte arg0) {
        if (arg0 <= 35) {
            method69(-17);
        }
        if (class14.field140 != null) {
            return class14.field140.field445 != null ? class16.field156[class14.field140.field445[class14.field139] & 255] : class16.field156[class14.field140.field449 & 255];
        } else {
            return 0;
        }
    }
}
