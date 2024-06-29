import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class286 extends class396 {

    @OriginalMember(owner = "client!jb", name = "C", descriptor = "Z")
    public boolean field4031 = true;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[I")
    public static int[] field4025 = new int[16384];

    @OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
    public static int[] field4035 = new int[16384];

    @OriginalMember(owner = "client!jb", name = "K", descriptor = "[Ljr;")
    public static class58[] field4039;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[I")
    private int[] field4021;

    @OriginalMember(owner = "client!jb", name = "J", descriptor = "[I")
    public int[] field4038;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field4022;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "[[I")
    private int[][] field4026;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lbk;Z[I)V")
    public final void method1816(class211 arg0, boolean arg1, int[] arg2) {
        field4034++;
        if (this.field4021 == null) {
            return;
        }
        int var4 = 0;
        if (!arg1) {
            return;
        }
        while (var4 < this.field4021.length) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class238.field3240[this.method1819(var4, 0)];
            if (var5 > 0) {
                arg0.method1352(arg1, var5, (long) arg2[var4]);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILbk;I)V")
    private final void method1817(int arg0, class211 arg1, int arg2) {
        field4027++;
        if (arg0 != -934) {
            return;
        }
        if (arg2 == 1) {
            this.field4022 = class112.method617('<', arg1.method1350(arg0 + 1019), 16777215);
        } else if (arg2 == 2) {
            int var4 = arg1.method1342((byte) -128);
            this.field4038 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4038[var5] = arg1.method1355(class97.method519(arg0, -32302));
            }
            return;
        } else if (arg2 == 3) {
            int var6 = arg1.method1342((byte) -126);
            this.field4026 = new int[var6][];
            this.field4021 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method1355(32136);
                this.field4021[var7] = var8;
                this.field4026[var7] = new int[class67.field767[var8]];
                for (int var9 = 0; var9 < class67.field767[var8]; var9++) {
                    this.field4026[var7][var9] = arg1.method1355(arg0 + 33070);
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field4031 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)I")
    public final int method1818(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method1825((byte) 16);
        }
        field4029++;
        if (this.field4021 == null || arg0 < 0 || arg0 > this.field4021.length) {
            return -1;
        } else if (this.field4026[arg0] == null || arg1 < 0 || arg1 > this.field4026[arg0].length) {
            return -1;
        } else {
            return this.field4026[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)I")
    public final int method1819(int arg0, int arg1) {
        field4020++;
        if (this.field4021 == null || arg0 < 0 || this.field4021.length < arg0) {
            return -1;
        } else {
            if (arg1 != 0) {
                field4025 = null;
            }
            return this.field4021[arg0];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILbk;)V")
    public final void method1820(int arg0, class211 arg1) {
        while (true) {
            int var3 = arg1.method1342((byte) -128);
            if (var3 == 0) {
                int var4 = 92 % ((-arg0 - 52) / 35);
                field4023++;
                return;
            }
            this.method1817(-934, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLbk;)Ljava/lang/String;")
    public final String method1821(byte arg0, class211 arg1) {
        field4036++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4021 != null) {
            for (int var4 = 0; var4 < this.field4021.length; var4++) {
                var3.append(this.field4022[var4]);
                var3.append(class162.method1056(this.field4026[var4], this.field4021[var4], arg0 ^ 0xFFFFFFAE, arg1.method1379(class337.field4998[this.field4021[var4]], -15386)));
            }
        }
        var3.append(this.field4022[this.field4022.length - 1]);
        if (arg0 != -51) {
            field4025 = null;
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public static void method1822(int arg0) {
        field4025 = null;
        if (arg0 > -13) {
            method1826(false, 111, (Color) null, (Color) null, (String) null, (byte) 71, (Color) null);
        }
        field4035 = null;
        field4039 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[Lkh;)V")
    public static final void method1823(int arg0, class11[] arg1) {
        class142.field2000 = arg1.length;
        field4030++;
        class37.field375 = new class11[class142.field2000 + 10];
        class314.field4468 = new int[class142.field2000 + 10];
        class408.method2570(arg1, 0, class37.field375, 0, class142.field2000);
        if (arg0 != 27718) {
            field4025 = null;
        }
        for (int var2 = 0; var2 < class142.field2000; var2++) {
            class314.field4468[var2] = class37.field375[var2].method47();
        }
        for (int var3 = class142.field2000; var3 < class37.field375.length; var3++) {
            class314.field4468[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "(I)I")
    public final int method1824(int arg0) {
        field4037++;
        if (arg0 != -11117) {
            field4039 = null;
        }
        return this.field4021 == null ? 0 : this.field4021.length;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
    public final void method1825(byte arg0) {
        field4024++;
        if (this.field4038 != null) {
            for (int var2 = 0; var2 < this.field4038.length; var2++) {
                this.field4038[var2] = class164.method1059(this.field4038[var2], 32768);
            }
        }
        if (arg0 >= -31) {
            this.method1825((byte) -84);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;BLjava/awt/Color;)V")
    public static final void method1826(boolean arg0, int arg1, Color arg2, Color arg3, String arg4, byte arg5, Color arg6) {
        try {
            Graphics var7 = class348.field5096.getGraphics();
            if (class216.field2951 == null) {
                class216.field2951 = new Font("Helvetica", 1, 13);
            }
            if (arg0) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class38.field389, class222.field3039);
            }
            if (arg6 == null) {
                arg6 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class148.field2076 == null) {
                    class148.field2076 = class348.field5096.createImage(304, 34);
                }
                if (arg5 != -44) {
                    field4025 = null;
                }
                Graphics var8 = class148.field2076.getGraphics();
                var8.setColor(arg3);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg6);
                var8.fillRect(2, 2, arg1 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var8.setFont(class216.field2951);
                var8.setColor(arg2);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class148.field2076, class38.field389 / 2 - 152, class222.field3039 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class38.field389 / 2 - 152;
                int var10 = class222.field3039 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg6);
                var7.fillRect(var9 + 2, var10 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg1 * 3 + var9 + 2, var10 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class216.field2951);
                var7.setColor(arg2);
                var7.drawString(arg4, (304 - arg4.length() * 6) / 2 + var9, var10 + 22);
            }
            if (class364.field5296 != null) {
                var7.setFont(class216.field2951);
                var7.setColor(arg2);
                var7.drawString(class364.field5296, class38.field389 / 2 - (class364.field5296.length() * 6 / 2), class222.field3039 / 2 + -26);
            }
        } catch (Exception var12) {
            class348.field5096.repaint();
        }
        field4033++;
    }

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method1827(int arg0) {
        field4032++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4022 == null) {
            return "";
        }
        var2.append(this.field4022[0]);
        if (arg0 > -32) {
            return null;
        }
        for (int var3 = 1; var3 < this.field4022.length; var3++) {
            var2.append("...");
            var2.append(this.field4022[var3]);
        }
        return var2.toString();
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4025[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4035[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field4039 = new class58[8];
    }
}
