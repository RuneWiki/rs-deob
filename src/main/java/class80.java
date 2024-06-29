import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class80 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public int field1109 = 8;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public int field1111 = 16777215;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field1107 = -1;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public int field1110;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lbf;")
    public static class108 field1100;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Z")
    public boolean field1102;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lbj;III)V")
    private final void method507(class215 arg0, int arg1, int arg2, int arg3) {
        field1112++;
        if (arg2 == 1) {
            this.field1109 = arg0.method1379(-101);
        } else if (arg2 == 2) {
            this.field1102 = true;
        } else if (arg2 == 3) {
            this.field1099 = arg0.method1356(false);
            this.field1108 = arg0.method1356(false);
            this.field1110 = arg0.method1356(false);
        } else if (arg2 == 4) {
            this.field1104 = arg0.method1374((byte) -60);
        } else if (arg2 == 5) {
            this.field1097 = arg0.method1379(-84);
        } else if (arg2 == 6) {
            this.field1111 = arg0.method1403(6591);
        }
        if (arg1 != 1) {
            this.field1104 = 118;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lbj;BI)V")
    public final void method508(class215 arg0, byte arg1, int arg2) {
        if (arg1 > -38) {
            return;
        }
        while (true) {
            int var4 = arg0.method1374((byte) -60);
            if (var4 == 0) {
                field1098++;
                return;
            }
            this.method507(arg0, 1, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)V")
    public static final void method509(byte arg0, int arg1) {
        if (class51.field724 == null) {
            class51.field724 = new byte[4][104][104];
        }
        for (int var2 = arg1; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class51.field724[var2][var3][var4] = arg0;
                }
            }
        }
        field1103++;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lnh;ZZIII)V")
    public static final void method510(class305 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg1) {
            method512(true);
        }
        class4.field31 = arg2;
        field1096++;
        class209.field3112 = arg5;
        class235.field3666 = arg3;
        class145.field2006 = arg0;
        class186.field2825 = arg4;
        class251.field3915 = 10000;
        class159.field2208 = 1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
    public static void method511(int arg0) {
        field1100 = null;
        if (arg0 != -3) {
            field1105 = 20;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    public static final void method512(boolean arg0) {
        class81.field1114.method944(-106);
        field1101++;
        if (!arg0) {
            method513(59, -33, 127);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public static final void method513(int arg0, int arg1, int arg2) {
        if (class145.field2009 != arg1) {
            class99.field1434 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class99.field1434[var3] = (var3 << 12) / arg1;
            }
            class309.field4977 = arg1 - 1;
            class132.field1837 = arg1 * 32;
            class145.field2009 = arg1;
        }
        if (class263.field4216 != arg2) {
            if (class145.field2009 == arg2) {
                class159.field2209 = class99.field1434;
            } else {
                class159.field2209 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class159.field2209[var4] = (var4 << 12) / arg2;
                }
            }
            class134.field1840 = arg2 - 1;
            class263.field4216 = arg2;
        }
        if (arg0 == 0) {
            field1106++;
        }
    }
}
