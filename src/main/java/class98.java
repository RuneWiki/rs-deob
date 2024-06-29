import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class98 extends class406 {

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[Lr;")
    public class98[] field1182;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "Z")
    public boolean field1176;

    @OriginalMember(owner = "client!r", name = "I", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public int field1187;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!r", name = "F", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "Lnj;")
    public class132 field1177;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Li;")
    public class26 field1184;

    @OriginalMember(owner = "client!r", name = "J", descriptor = "Lil;")
    public static class5 field1196;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "[Lgh;")
    public static class327[] field1191;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[[Lon;")
    public static class184[][] field1194;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public void method538(int arg0, int arg1, int arg2) {
        field1197++;
        int var4 = this.field1187 == 255 ? arg0 : this.field1187;
        if (this.field1176) {
            this.field1177 = new class132(var4, arg0, arg1);
        } else {
            this.field1184 = new class26(var4, arg0, arg1);
        }
        if (arg2 != -1) {
            field1194 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBI)[I")
    public final int[] method539(int arg0, byte arg1, int arg2) {
        field1192++;
        if (arg1 > -57) {
            return null;
        } else if (this.field1182[arg0].field1176) {
            return this.field1182[arg0].method83(0, arg2);
        } else {
            return this.field1182[arg0].method194(arg2, 122)[0];
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public void method188(int arg0) {
        field1189++;
        if (arg0 != 1) {
            method542((byte) -107);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public void method540(int arg0) {
        if (this.field1176) {
            this.field1177.method817(arg0 - 30202);
            this.field1177 = null;
        } else {
            this.field1184.method181(1);
            this.field1184 = null;
        }
        if (arg0 != 30103) {
            field1196 = null;
        }
        field1185++;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)I")
    public int method541(int arg0) {
        if (arg0 > -86) {
            return -54;
        } else {
            field1179++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method542(byte arg0) {
        field1196 = null;
        field1191 = null;
        if (arg0 > -17) {
            field1193 = 118;
        }
        field1194 = null;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)I")
    public int method543(byte arg0) {
        field1190++;
        if (arg0 > -40) {
            this.field1184 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILdg;I)V")
    public void method81(int arg0, class236 arg1, int arg2) {
        field1188++;
        if (arg2 != 0) {
            this.method541(-124);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
    public int[] method83(int arg0, int arg1) {
        field1180++;
        if (arg0 != 0) {
            this.method546(126, (byte) 21, -12);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)[[I")
    public int[][] method194(int arg0, int arg1) {
        int var3 = 33 / ((60 - arg1) / 43);
        field1181++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V")
    public static final void method544(byte arg0) {
        class12.field160.method1626((byte) 106);
        field1186++;
        if (arg0 > -111) {
            field1196 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Z")
    public static final boolean method545(int arg0, byte arg1) {
        field1178++;
        if (class327.field4638[arg0]) {
            return true;
        } else if (class274.field3881.method2429((byte) -75, arg0)) {
            int var2 = class274.field3881.method2415(arg0, (byte) 56);
            if (var2 == 0) {
                class327.field4638[arg0] = true;
                return true;
            }
            if (field1194[arg0] == null) {
                field1194[arg0] = new class184[var2];
            }
            if (arg1 != 11) {
                field1195 = 102;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (field1194[arg0][var3] == null) {
                    byte[] var4 = class274.field3881.method2431((byte) 88, arg0, var3);
                    if (var4 != null) {
                        class184 var5 = field1194[arg0][var3] = new class184();
                        var5.field2584 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method1244(arg1 ^ 0x30, new class236(var4));
                    }
                }
            }
            class327.field4638[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(IZ)V")
    public class98(int arg0, boolean arg1) {
        this.field1182 = new class98[arg0];
        this.field1176 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IBI)[[I")
    public final int[][] method546(int arg0, byte arg1, int arg2) {
        if (arg1 != 33) {
            return null;
        }
        field1183++;
        if (this.field1182[arg2].field1176) {
            int[] var4 = this.field1182[arg2].method83(0, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field1182[arg2].method194(arg0, arg1 + 78);
        }
    }

    static {
        new class362("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field1195 = 0;
    }
}
