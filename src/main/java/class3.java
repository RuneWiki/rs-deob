import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 extends class13 {

    @OriginalMember(owner = "mapview!b", name = "A", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "mapview!b", name = "B", descriptor = "Lw;")
    public static class38 field15 = class35.method219("Vegetable Store", true);

    @OriginalMember(owner = "mapview!b", name = "E", descriptor = "Lw;")
    public static class38 field18 = class35.method219("Loading )3)3)3", true);

    @OriginalMember(owner = "mapview!b", name = "y", descriptor = "Lw;")
    public static class38 field12 = class35.method219("null", true);

    @OriginalMember(owner = "mapview!b", name = "z", descriptor = "Lw;")
    public static class38 field13 = class35.method219("Overview", true);

    @OriginalMember(owner = "mapview!b", name = "G", descriptor = "I")
    public static volatile int field20 = 0;

    @OriginalMember(owner = "mapview!b", name = "F", descriptor = "I")
    public static volatile int field19 = -1;

    @OriginalMember(owner = "mapview!b", name = "D", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "mapview!b", name = "C", descriptor = "[[Lu;")
    public static class36[][] field16;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(IBIIB)V", line = 7)
    public static final void method6(int arg0, byte arg1, int arg2, int arg3, byte arg4) {
        int var5 = arg3 >> 6;
        int var6 = arg2 >> 6;
        if (class18.field180[arg0][var6][var5] == null) {
            class18.field180[arg0][var6][var5] = new byte[4096];
        }
        if (arg1 <= 48) {
            field14 = -94;
        }
        class18.field180[arg0][var6][var5][(class18.method100(arg2, 63) << 6) - -class18.method100(arg3, 63)] = arg4;
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "(I)V", line = 27)
    public static void method7(int arg0) {
        field18 = null;
        if (arg0 != 0) {
            method9(false, (Object) null, -22);
        }
        field13 = null;
        field15 = null;
        field16 = (class36[][]) null;
        field12 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([BZZZ)V", line = 43)
    private class3(byte[] arg0, boolean arg1, boolean arg2, boolean arg3) throws IOException {
        super(arg1, arg2);
        this.method11(false, new DataInputStream(new ByteArrayInputStream(arg0)), arg3);
    }

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "(I)B", line = 55)
    public static final byte method8(int arg0) {
        int var1 = 19 / ((arg0 - -3) / 63);
        return class1.field11 != null ? class1.field11[mapview.field257] : 0;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZLjava/lang/Object;I)[B", line = 77)
    public static final byte[] method9(boolean arg0, Object arg1, int arg2) {
        if (arg1 == null) {
            return null;
        } else if (!(arg1 instanceof byte[])) {
            if (arg2 != 0) {
                return (byte[]) null;
            } else if (arg1 instanceof class32) {
                class32 var3 = (class32) arg1;
                return var3.method194(0);
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            byte[] var4 = (byte[]) ((byte[]) arg1);
            return !arg0 ? var4 : class16.method87(var4, false);
        }
    }

    @OriginalMember(owner = "mapview!b", name = "<init>", descriptor = "([BZZ)V", line = 111)
    public class3(byte[] arg0, boolean arg1, boolean arg2) throws IOException {
        this(arg0, arg1, arg2, false);
    }

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "([BI)[B", line = 117)
    public static final byte[] method10(byte[] arg0, int arg1) {
        class18 var2 = new class18(arg0);
        int var3 = var2.method103(255);
        int var4 = var2.method113((byte) 79);
        if (arg1 > var4 || class25.field356 != 0 && class25.field356 < var4) {
            throw new RuntimeException();
        } else if (~var3 == -1) {
            byte[] var9 = new byte[var4];
            var2.method102((byte) -121, var4, var9, 0);
            return var9;
        } else {
            int var5 = var2.method113((byte) 91);
            if (-1 < ~var5 || class25.field356 != 0 && ~class25.field356 > ~var5) {
                throw new RuntimeException();
            } else {
                byte[] var6 = new byte[var5];
                if (var3 == 1) {
                    class14.method65(var6, var5, arg0, var4, 9);
                } else {
                    try {
                        DataInputStream var7 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                        var7.readFully(var6);
                        var7.close();
                    } catch (IOException var10) {
                    }
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(ZLjava/io/DataInputStream;Z)V", line = 174)
    private final void method11(boolean arg0, DataInputStream arg1, boolean arg2) throws IOException {
        if (arg2) {
        }
        int var4 = arg1.read();
        int var5 = arg1.readInt();
        int var6 = var5;
        if (~var4 != -1) {
            var5 += 4;
        }
        class18 var7 = new class18(var5 + 5);
        var7.method101(var4, 122);
        var7.method106(-96089736, var6);
        arg1.readFully(var7.field183, var7.field186, var5);
        this.method54(var7.field183, -2);
        int var8 = 0;
        if (arg0) {
            field19 = -69;
        }
        while (~super.field131 < ~var8) {
            int var9 = arg1.read();
            int var10 = arg1.readInt();
            int var11 = var10;
            if (~var9 != -1) {
                var10 += 4;
            }
            class18 var12 = new class18(var10 - -5);
            var12.method101(var9, 98);
            var12.method106(-96089736, var11);
            while (-33554433 > ~var10) {
                var10 -= 33554432;
                arg1.readFully(var12.field183, var12.field186, 33554432);
                var12.field186 += 33554432;
            }
            arg1.readFully(var12.field183, var12.field186, var10);
            super.field121[super.field114[var8]] = class5.method18(false, var12.field183, 67);
            ++var8;
        }
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lo;", line = 249)
    public static final class26 method12(Throwable arg0, String arg1) {
        class26 var2;
        if (!(arg0 instanceof class26)) {
            var2 = new class26(arg0, arg1);
        } else {
            var2 = (class26) arg0;
            var2.field365 = var2.field365 + ' ' + arg1;
        }
        return var2;
    }
}
