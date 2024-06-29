import jagex3.jagmisc.jagmisc;
import java.awt.event.ActionEvent;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class4 extends class81 {

    @OriginalMember(owner = "client!ft", name = "S", descriptor = "Z")
    public boolean field20 = false;

    @OriginalMember(owner = "client!ft", name = "eb", descriptor = "Z")
    public boolean field32 = false;

    @OriginalMember(owner = "client!ft", name = "U", descriptor = "[Luo;")
    public static class412[] field22 = new class412[0];

    @OriginalMember(owner = "client!ft", name = "db", descriptor = "Ljava/lang/String;")
    public static String field31 = "";

    @OriginalMember(owner = "client!ft", name = "T", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ft", name = "V", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ft", name = "W", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!ft", name = "X", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ft", name = "Y", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ft", name = "Z", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ft", name = "ab", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ft", name = "bb", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ft", name = "cb", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ft", name = "fb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ljava/lang/Object;ILdq;)V", line = 3)
    public static final void method11(Object arg0, int arg1, class500 arg2) {
        int var3 = -66 / ((arg1 - -9) / 53);
        ++field30;
        if (arg2.field7383 != null) {
            for (int var4 = 0; var4 < 50 && arg2.field7383.peekEvent() != null; ++var4) {
                class388.method2433(1L, -62);
            }
            if (arg0 != null) {
                arg2.field7383.postEvent(new ActionEvent(arg0, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V", line = 28)
    public static final void method12(boolean arg0) {
        if (arg0) {
            field22 = null;
        }
        ++field23;
        for (class119 var1 = (class119) class460.field6887.method445(33); var1 != null; var1 = (class119) class460.field6887.method451(false)) {
            if (~var1.field1637 != 0) {
                var1.method25(-13489);
            } else {
                var1.field1639 = 0;
                if (~var1.field1638 <= -1 && var1.field1640 >= 0 && ~class398.field6071 < ~var1.field1638 && var1.field1640 < class528.field7734) {
                    class46.method359(var1, (byte) 93);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lnj;I)V", line = 60)
    private final void method13(class164 arg0, int arg1) {
        ++field26;
        if (~(arg0.field2219.length - arg0.field2185) <= -2) {
            int var3 = arg0.method1087(false);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (~var3 == -18) {
                    var4 = 40;
                } else if (~var3 == -17) {
                    var4 = 38;
                } else if (var3 == 15) {
                    var4 = 37;
                } else if (var3 == 14) {
                    var4 = 36;
                } else if (~var3 == -14) {
                    var4 = 35;
                } else if (~var3 != -13) {
                    if (var3 != 11) {
                        if (var3 == 10) {
                            var4 = 32;
                        } else if (~var3 == -10) {
                            var4 = 31;
                        } else if (~var3 != -9) {
                            if (var3 != 7) {
                                if (~var3 != -7) {
                                    if (~var3 != -6) {
                                        if (var3 == 4) {
                                            var4 = 24;
                                        } else if (var3 != 3) {
                                            if (~var3 == -3) {
                                                var4 = 22;
                                            } else if (~var3 == -2) {
                                                var4 = 23;
                                            } else {
                                                var4 = 19;
                                            }
                                        } else {
                                            var4 = 23;
                                        }
                                    } else {
                                        var4 = 28;
                                    }
                                } else {
                                    var4 = 28;
                                }
                            } else {
                                var4 = 29;
                            }
                        } else {
                            var4 = 30;
                        }
                    } else {
                        var4 = 33;
                    }
                } else {
                    var4 = 34;
                }
                if (~var4 >= ~(arg0.field2219.length - arg0.field2185)) {
                    super.field1166 = arg0.method1087(false);
                    if (~super.field1166 > -2) {
                        super.field1166 = 1;
                    } else if (super.field1166 > 4) {
                        super.field1166 = 4;
                    }
                    this.method19(~arg0.method1087(false) == -2, 23809);
                    super.field1168 = ~arg0.method1087(false) == -2;
                    super.field1155 = ~arg0.method1087(false) == -2;
                    super.field1164 = arg0.method1087(false) == 1;
                    super.field1163 = ~arg0.method1087(false) == -2 ? 1 : 0;
                    super.field1182 = ~arg0.method1087(false) == -2;
                    super.field1159 = arg0.method1087(false) == 1;
                    super.field1153 = ~arg0.method1087(false) == -2;
                    super.field1169 = arg0.method1087(false);
                    if (arg1 >= 62) {
                        if (~super.field1169 < -3) {
                            super.field1169 = 2;
                        }
                        if (var3 >= 17) {
                            super.field1178 = arg0.method1087(false);
                        }
                        if (var3 < 2) {
                            super.field1172 = arg0.method1087(false) == 1;
                            arg0.method1087(false);
                        } else {
                            super.field1172 = arg0.method1087(false) == 1;
                            if (var3 >= 17) {
                                super.field1156 = arg0.method1087(false) == 1;
                            }
                        }
                        super.field1165 = ~arg0.method1087(false) == -2;
                        super.field1174 = ~arg0.method1087(false) == -2;
                        super.field1171 = arg0.method1087(false);
                        if (super.field1171 > 2) {
                            super.field1171 = 2;
                        }
                        super.field1150 = super.field1171;
                        super.field1148 = ~arg0.method1087(false) == -2;
                        super.field1173 = arg0.method1087(false);
                        if (super.field1173 > 127) {
                            super.field1173 = 127;
                        }
                        super.field1157 = arg0.method1087(false);
                        super.field1183 = arg0.method1087(false);
                        if (super.field1183 > 127) {
                            super.field1183 = 127;
                        }
                        if (~var3 <= -2) {
                            super.field1158 = arg0.method1074(-635989152);
                            super.field1154 = arg0.method1074(-635989152);
                        }
                        if (~var3 <= -4 && var3 < 6) {
                            arg0.method1087(false);
                        }
                        if (~var3 <= -5) {
                            int var5 = arg0.method1087(false);
                            if (var5 < 0 || ~var5 < -3) {
                                var5 = 0;
                            }
                            if (class230.field3289 < 96) {
                                var5 = 0;
                            }
                            class189.method1260((byte) 113, var5);
                        }
                        if (var3 >= 5) {
                            super.field1162 = arg0.method1099(-112);
                        }
                        int var6 = 0;
                        if (~var3 <= -7) {
                            super.field1161 = var6 = arg0.method1087(false);
                        }
                        if (~super.field1161 != -2 && ~super.field1161 != -3) {
                            super.field1161 = 2;
                        }
                        if (~var3 <= -8) {
                            super.field1146 = arg0.method1087(false) == 1;
                        }
                        if (var3 >= 8) {
                            super.field1180 = ~arg0.method1087(false) == -2;
                        }
                        if (var3 >= 9) {
                            super.field1175 = arg0.method1087(false);
                        }
                        if (~super.field1175 > -1 || super.field1175 > class321.method2001(-10744, class230.field3289)) {
                            super.field1175 = 0;
                        }
                        if (~var3 <= -11) {
                            super.field1149 = ~arg0.method1087(false) != -1;
                        }
                        if (~var3 <= -12) {
                            super.field1152 = ~arg0.method1087(false) != -1;
                        }
                        if (~var3 <= -13) {
                            super.field1163 = arg0.method1087(false);
                        }
                        if (~super.field1163 > -1 || super.field1163 > 2) {
                            super.field1163 = 1;
                        }
                        if (var3 >= 13) {
                            super.field1151 = ~arg0.method1087(false) == -2;
                        }
                        if (~var3 > -15) {
                            if (var6 == 0) {
                                super.field1177 = 2;
                            } else {
                                super.field1177 = 1;
                            }
                        } else {
                            super.field1177 = arg0.method1087(false);
                        }
                        if (~super.field1177 > -1 || ~super.field1177 < -4) {
                            super.field1177 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field1170 = arg0.method1087(false);
                            if (super.field1170 < 0 || ~super.field1170 < -5) {
                                super.field1170 = class429.field6544 != 1 ? 4 : 2;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field1181 = arg0.method1087(false) == 1;
                            try {
                                if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                    super.field1181 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && ~super.field1177 == -1) {
                            super.field1177 = 2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)Lnj;", line = 325)
    public final class164 method14(int arg0) {
        ++field28;
        class164 var2 = new class164(41);
        var2.method1072((byte) 102, 17);
        var2.method1072((byte) 102, super.field1166);
        var2.method1072((byte) 102, super.field1145 ? 1 : 0);
        var2.method1072((byte) 102, super.field1168 ? 1 : 0);
        var2.method1072((byte) 102, super.field1155 ? 1 : 0);
        var2.method1072((byte) 102, !super.field1164 ? 0 : 1);
        var2.method1072((byte) 102, 0);
        var2.method1072((byte) 102, !super.field1182 ? 0 : 1);
        var2.method1072((byte) 102, super.field1159 ? 1 : 0);
        var2.method1072((byte) 102, !super.field1153 ? 0 : 1);
        var2.method1072((byte) 102, super.field1169);
        var2.method1072((byte) 102, super.field1178);
        var2.method1072((byte) 102, super.field1172 ? 1 : 0);
        var2.method1072((byte) 102, !super.field1156 ? 0 : 1);
        var2.method1072((byte) 102, super.field1165 ? 1 : 0);
        var2.method1072((byte) 102, super.field1174 ? 1 : 0);
        var2.method1072((byte) 102, super.field1171);
        var2.method1072((byte) 102, super.field1148 ? 1 : 0);
        var2.method1072((byte) 102, super.field1173);
        var2.method1072((byte) 102, super.field1157);
        if (arg0 != 2) {
            field31 = null;
        }
        var2.method1072((byte) 102, super.field1183);
        var2.method1114(super.field1158, 105);
        var2.method1114(super.field1154, 96);
        var2.method1072((byte) 102, class294.method1880(arg0 ^ -9085));
        var2.method1073(326170192, super.field1162);
        var2.method1072((byte) 102, super.field1161);
        var2.method1072((byte) 102, !super.field1146 ? 0 : 1);
        var2.method1072((byte) 102, super.field1180 ? 1 : 0);
        var2.method1072((byte) 102, super.field1175);
        var2.method1072((byte) 102, super.field1149 ? 1 : 0);
        var2.method1072((byte) 102, super.field1152 ? 1 : 0);
        var2.method1072((byte) 102, super.field1163);
        var2.method1072((byte) 102, super.field1151 ? 1 : 0);
        var2.method1072((byte) 102, super.field1177);
        var2.method1072((byte) 102, super.field1170);
        var2.method1072((byte) 102, !super.field1181 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)Z", line = 374)
    public final boolean method15(int arg0, int arg1) {
        ++field25;
        return arg0 == arg1 && !this.field20 ? super.field1145 : true;
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(II)I", line = 387)
    public final int method16(int arg0, int arg1) {
        ++field27;
        if (this.field32) {
            return 0;
        } else if (arg1 >= -88) {
            return 52;
        } else if (!this.method15(arg0, 0)) {
            return 1;
        } else {
            return super.field1168 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Ldq;)V", line = 497)
    public class4(class500 arg0) {
        super.field1166 = 3;
        this.method19(true, 23809);
        super.field1163 = 1;
        super.field1172 = true;
        super.field1155 = true;
        super.field1174 = true;
        super.field1178 = 0;
        super.field1159 = true;
        super.field1157 = 127;
        super.field1183 = 127;
        super.field1158 = 0;
        super.field1164 = true;
        super.field1150 = 0;
        super.field1156 = false;
        super.field1153 = true;
        super.field1171 = 0;
        super.field1148 = true;
        super.field1169 = 2;
        super.field1173 = 127;
        super.field1182 = true;
        super.field1154 = 0;
        super.field1168 = true;
        super.field1165 = true;
        if (class230.field3289 < 96) {
            class189.method1260((byte) 96, 0);
        } else {
            class189.method1260((byte) 5, 2);
        }
        super.field1152 = true;
        super.field1177 = 2;
        super.field1175 = 0;
        super.field1162 = 0;
        super.field1180 = false;
        super.field1151 = true;
        super.field1170 = class429.field6544 != 1 ? 4 : 2;
        super.field1149 = false;
        super.field1146 = false;
        super.field1161 = 2;
        class368 var2 = null;
        try {
            class234 var3 = arg0.method2975(true, 8, "");
            while (var3.field3322 == 0) {
                class388.method2433(1L, 104);
            }
            if (var3.field3322 == 1) {
                var2 = (class368) var3.field3324;
                byte[] var4 = new byte[(int) var2.method2343((byte) 31)];
                int var6;
                for (int var5 = 0; ~var4.length < ~var5; var5 += var6) {
                    var6 = var2.method2340(var4.length + -var5, var5, true, var4);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method13(new class164(var4), 93);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method2344((byte) -93);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "(I)V", line = 409)
    public static void method17(int arg0) {
        field31 = null;
        field22 = null;
        if (arg0 <= 126) {
            field31 = null;
        }
    }

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "(II)Z", line = 426)
    public final boolean method18(int arg0, int arg1) {
        if (arg1 < 118) {
            return true;
        } else {
            ++field21;
            return arg0 == 0 ? super.field1145 : true;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(ZI)V", line = 441)
    public final void method19(boolean arg0, int arg1) {
        super.field1145 = arg0;
        if (arg1 != 23809) {
            this.field20 = false;
        }
        ++field24;
        if (class432.field6575 != null) {
            class432.field6575.method1867(!this.method15(class378.field5771, 0), 50);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Ldq;I)V", line = 464)
    public final void method20(class500 arg0, int arg1) {
        ++field33;
        class368 var3 = null;
        try {
            class234 var4 = arg0.method2975(true, arg1 ^ 9, "");
            while (var4.field3322 == 0) {
                class388.method2433(1L, 123);
            }
            if (var4.field3322 == arg1) {
                var3 = (class368) var4.field3324;
                class164 var5 = this.method14(2);
                var3.method2341(var5.field2185, 0, var5.field2219, 124);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method2344((byte) -93);
            }
        } catch (Exception var6) {
        }
    }
}
