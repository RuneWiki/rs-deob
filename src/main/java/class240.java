import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class240 extends class102 {

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public int field4159 = 12800;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "I")
    public int field4161 = -1;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "I")
    public int field4171 = 12800;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public int field4158 = 0;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "I")
    public int field4162 = 0;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "Z")
    public boolean field4165 = true;

    @OriginalMember(owner = "client!uf", name = "fb", descriptor = "Lr;")
    public class66 field4181;

    @OriginalMember(owner = "client!uf", name = "Z", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!uf", name = "eb", descriptor = "I")
    public int field4180;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Lr;")
    public class66 field4164;

    @OriginalMember(owner = "client!uf", name = "gb", descriptor = "Lc;")
    public class125 field4182;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "[I")
    public static int[] field4160 = new int[2];

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "Lr;")
    public static class66 field4166 = class93.method641(43, " <col=00ff80>");

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "[I")
    public static int[] field4168 = new int[256];

    @OriginalMember(owner = "client!uf", name = "Y", descriptor = "I")
    public static int field4174 = -1;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "I")
    public static int field4172 = 0;

    @OriginalMember(owner = "client!uf", name = "ab", descriptor = "Lr;")
    public static class66 field4176 = class93.method641(43, "l");

    @OriginalMember(owner = "client!uf", name = "bb", descriptor = "Ldh;")
    public static class265 field4177 = null;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
    public static int field4170 = 0;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!uf", name = "X", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!uf", name = "cb", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!uf", name = "db", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!uf", name = "T", descriptor = "Llb;")
    public static class228 field4169;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public final void method1576(int arg0) {
        this.field4171 = arg0;
        field4167++;
        this.field4158 = 0;
        this.field4159 = 12800;
        this.field4162 = 0;
        for (class17 var2 = (class17) this.field4182.method873((byte) 76); var2 != null; var2 = (class17) this.field4182.method870((byte) -106)) {
            if (var2.field241 > this.field4162) {
                this.field4162 = var2.field241;
            }
            if (this.field4159 > var2.field240) {
                this.field4159 = var2.field240;
            }
            if (this.field4171 > var2.field235) {
                this.field4171 = var2.field235;
            }
            if (var2.field239 > this.field4158) {
                this.field4158 = var2.field239;
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZI[BI[Lga;IIZII)V")
    public static final void method1577(int arg0, boolean arg1, int arg2, byte[] arg3, int arg4, class165[] arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        if (arg1) {
            field4160 = null;
        }
        if (!arg8) {
            for (int var11 = 0; var11 < 8; var11++) {
                for (int var12 = 0; var12 < 8; var12++) {
                    if (arg2 + var11 > 0 && (arg2 + var11) < 103 && (arg10 + var12) > 0 && (arg10 + var12) < 103) {
                        arg5[arg7].field2976[arg2 + var11][arg10 + var12] = class115.method767(arg5[arg7].field2976[arg2 + var11][arg10 + var12], -16777217);
                    }
                }
            }
        }
        field4178++;
        byte var13;
        if (arg8) {
            var13 = 1;
        } else {
            var13 = 4;
        }
        class249 var14 = new class249(arg3);
        for (int var15 = 0; var15 < var13; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg9 == var15 && arg0 <= var16 && var16 < arg0 + 8 && arg4 <= var17 && (arg4 + 8) > var17) {
                        class170.method1160(arg8, arg2 + class136.method934(arg6, var17 & 0x7, var16 & 0x7, -27039), 0, 0, var14, arg7, arg6, (byte) 37, class20.method84((byte) -94, arg6, var17 & 0x7, var16 & 0x7) + arg10);
                    } else {
                        class170.method1160(arg8, -1, 0, 0, var14, 0, 0, (byte) 118, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)Z")
    public final boolean method1578(int arg0, int arg1, int arg2) {
        field4179++;
        if (this.field4171 > arg1 || arg1 > this.field4162 || arg2 < this.field4159 || this.field4158 < arg2) {
            return false;
        }
        class17 var4 = (class17) this.field4182.method873((byte) 76);
        int var5 = -107 / ((-arg0 - 26) / 57);
        while (var4 != null) {
            if (var4.method66(arg1, -9710, arg2)) {
                return true;
            }
            var4 = (class17) this.field4182.method870((byte) 109);
        }
        return false;
    }

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "(I)V")
    public static void method1579(int arg0) {
        field4177 = null;
        field4166 = null;
        if (arg0 != 25465) {
            field4160 = null;
        }
        field4176 = null;
        field4160 = null;
        field4168 = null;
        field4169 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(II)I")
    public static final int method1580(int arg0, int arg1) {
        if (arg1 == 255) {
            field4173++;
            return arg0 & 0xFF;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILcj;ZLcj;)V")
    public static final void method1581(int arg0, class28 arg1, boolean arg2, class28 arg3) {
        class153.field2719 = arg1;
        if (arg0 != 12800) {
            method1580(62, 98);
        }
        field4163++;
        class219.field3763 = arg2;
        class43.field717 = arg3;
    }

    @OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lr;Lr;IIIZ)V")
    public class240(class66 arg0, class66 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field4161 = arg4;
        this.field4165 = arg5;
        this.field4181 = arg1;
        this.field4175 = arg2;
        this.field4180 = arg3;
        this.field4164 = arg0;
        this.field4182 = new class125();
    }
}
