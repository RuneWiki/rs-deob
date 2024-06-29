import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    private int field151 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    private int field149 = 0;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lvfa;")
    private class262 field157 = null;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "I")
    private int field152 = 0;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "Lag;")
    private class469 field154;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lica;")
    private class215 field153;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "[Lne;")
    private class182[] field156;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "Lde;")
    public class15 field160;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "[I")
    public static int[] field158 = new int[5];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjd;)V", line = 3)
    public static final void method71(int arg0, class537 arg1) {
        for (int var2 = arg0; var2 < class564.field7691; var2++) {
            int var3 = class573.field7829[var2];
            class573 var4 = class513.field7145[var3];
            int var5 = arg1.method930(255);
            if ((var5 & 0x1) != 0) {
                var5 += arg1.method930(255) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg1.method930(255) << 16;
            }
            class566.method3137(var5, var4, arg1, (byte) -109, var3);
        }
        field155++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 35)
    public static void method72(int arg0) {
        field158 = null;
        if (arg0 != 15535) {
            method72(-112);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lag;)V", line = 405)
    public class12(class469 arg0) {
        this.field154 = arg0;
        this.field153 = new class215(arg0);
        this.field156 = new class182[10];
        this.field156[1] = new class217(arg0);
        this.field156[2] = new class349(arg0, this.field153);
        this.field156[4] = new class613(arg0, this.field153);
        this.field156[5] = new class625(arg0, this.field153);
        this.field156[6] = new class13(arg0);
        this.field156[7] = new class132(arg0);
        this.field156[3] = this.field160 = new class15(arg0);
        this.field156[8] = new class125(arg0, this.field153);
        this.field156[9] = new class165(arg0, this.field153);
        if (!this.field156[8].method77((byte) -96)) {
            this.field156[8] = this.field156[4];
        }
        if (!this.field156[9].method77((byte) -96)) {
            this.field156[9] = this.field156[8];
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLvfa;I)Z", line = 53)
    public final boolean method73(byte arg0, class262 arg1, int arg2) {
        field162++;
        if (this.field152 == 0) {
            return false;
        }
        if (this.field157 != arg1) {
            this.field156[Integer.MAX_VALUE & this.field152].method83(arg2, arg1, (byte) 116);
            this.field157 = arg1;
        }
        return arg0 == 73 ? true : true;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z", line = 78)
    public final boolean method74(int arg0, int arg1) {
        field161++;
        return arg1 == -1 ? this.field156[arg0].method77((byte) -96) : false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILev;IIIBIII)Z", line = 97)
    public static final boolean method75(int arg0, int arg1, int arg2, class593 arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10) {
        field150++;
        int var11 = arg8;
        int var12 = arg4;
        byte var13 = 64;
        if (arg7 < 59) {
            return false;
        }
        byte var14 = 64;
        int var15 = arg8 - var13;
        class77.field913[var13][var14] = 99;
        int var16 = arg4 - var14;
        class595.field8210[var13][var14] = 0;
        byte var17 = 0;
        class310.field4191[var17] = arg8;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class585.field8082[var10001] = arg4;
        int[][] var19 = arg3.field8191;
        while (var26 != var18) {
            var12 = class585.field8082[var18];
            var11 = class310.field4191[var18];
            int var20 = var11 - arg3.field8177;
            int var21 = var12 - arg3.field8184;
            int var22 = var12 - var16;
            var18 = var18 + 1 & 0xFFF;
            int var23 = var11 - var15;
            if (arg1 == -4) {
                if (arg10 == var11 && arg9 == var12) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class537.method3007(arg10, 14969, var12, arg9, 1, var11, arg6, 1, arg5)) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg3.method3295(arg10, 1, var11, 1, arg5, arg0, arg6, (byte) -120, var12, arg9)) {
                    class6.field61 = var12;
                    class436.field5814 = var11;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg3.method3286(arg5, var12, var11, arg0, arg9, -110, 1, arg10, arg6)) {
                    class6.field61 = var12;
                    class436.field5814 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg3.method3294(arg2, arg9, 1, arg1, arg10, 101, var11, var12)) {
                    class436.field5814 = var11;
                    class6.field61 = var12;
                    return true;
                }
            } else if (arg3.method3287(arg10, 1, arg9, var12, arg2, 32, arg1, var11)) {
                class6.field61 = var12;
                class436.field5814 = var11;
                return true;
            }
            int var25 = class595.field8210[var23][var22] + 1;
            if (var23 > 0 && class77.field913[var23 - 1][var22] == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0) {
                class310.field4191[var26] = var11 - 1;
                class585.field8082[var26] = var12;
                class77.field913[var23 - 1][var22] = 2;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var23 - 1][var22] = var25;
            }
            if (var23 < 127 && class77.field913[var23 + 1][var22] == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0) {
                class310.field4191[var26] = var11 + 1;
                class585.field8082[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var23 + 1][var22] = 8;
                class595.field8210[var23 + 1][var22] = var25;
            }
            if (var22 > 0 && class77.field913[var23][var22 - 1] == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class310.field4191[var26] = var11;
                class585.field8082[var26] = var12 - 1;
                class77.field913[var23][var22 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var23][var22 - 1] = var25;
            }
            if (var22 < 127 && class77.field913[var23][var22 + 1] == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class310.field4191[var26] = var11;
                class585.field8082[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var23][var22 + 1] = 4;
                class595.field8210[var23][var22 + 1] = var25;
            }
            if (var23 > 0 && var22 > 0 && class77.field913[var23 - 1][var22 - 1] == 0 && (var19[var20 - 1][var21 - 1] & 0x43A40000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class310.field4191[var26] = var11 - 1;
                class585.field8082[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var23 - 1][var22 - 1] = 3;
                class595.field8210[var23 - 1][var22 - 1] = var25;
            }
            if (var23 < 127 && var22 > 0 && class77.field913[var23 + 1][var22 - 1] == 0 && (var19[var20 + 1][var21 - 1] & 0x60E40000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 - 1] & 0x40A40000) == 0) {
                class310.field4191[var26] = var11 + 1;
                class585.field8082[var26] = var12 - 1;
                class77.field913[var23 + 1][var22 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var23 + 1][var22 - 1] = var25;
            }
            if (var23 > 0 && var22 < 127 && class77.field913[var23 - 1][var22 + 1] == 0 && (var19[var20 - 1][var21 + 1] & 0x4E240000) == 0 && (var19[var20 - 1][var21] & 0x42240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class310.field4191[var26] = var11 - 1;
                class585.field8082[var26] = var12 + 1;
                class77.field913[var23 - 1][var22 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class595.field8210[var23 - 1][var22 + 1] = var25;
            }
            if (var23 < 127 && var22 < 127 && class77.field913[var23 + 1][var22 + 1] == 0 && (var19[var20 + 1][var21 + 1] & 0x78240000) == 0 && (var19[var20 + 1][var21] & 0x60240000) == 0 && (var19[var20][var21 + 1] & 0x48240000) == 0) {
                class310.field4191[var26] = var11 + 1;
                class585.field8082[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class77.field913[var23 + 1][var22 + 1] = 12;
                class595.field8210[var23 + 1][var22 + 1] = var25;
            }
        }
        class436.field5814 = var11;
        class6.field61 = var12;
        return false;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZIZII)V", line = 347)
    public final void method76(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg0 < 107) {
            this.field153 = null;
        }
        field159++;
        boolean var7 = arg3 & this.field154.method1135();
        if (!var7 && (arg5 == 4 || arg5 == 8 || arg5 == 9)) {
            if (arg5 == 4) {
                arg4 = arg2;
            }
            arg5 = 2;
        }
        if (arg5 != 0 && arg1) {
            arg5 |= Integer.MIN_VALUE;
        }
        if (this.field152 != arg5) {
            if (this.field152 != 0) {
                this.field156[Integer.MAX_VALUE & this.field152].method82(26813);
            }
            if (arg5 != 0) {
                this.field156[Integer.MAX_VALUE & arg5].method84(true, arg1);
                this.field156[arg5 & Integer.MAX_VALUE].method79(arg1, -56);
                this.field156[Integer.MAX_VALUE & arg5].method81(2, arg4, arg2);
            }
            this.field149 = arg4;
            this.field151 = arg2;
            this.field157 = null;
            this.field152 = arg5;
        } else if (this.field152 != 0) {
            this.field156[Integer.MAX_VALUE & this.field152].method79(arg1, -41);
            if (this.field151 != arg2 || this.field149 != arg4) {
                this.field156[Integer.MAX_VALUE & this.field152].method81(2, arg4, arg2);
                this.field151 = arg2;
                this.field149 = arg4;
            }
        }
    }
}
