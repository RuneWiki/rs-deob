import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class21 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "Ltb;")
    private class450 field323 = new class450(64);

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lpl;")
    public class612 field326;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lpl;")
    private class612 field328;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Lida;", line = 4)
    public static final class138 method146(int arg0, int arg1, int arg2) {
        class75 var3 = class270.field3423[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1024;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lks;II)V", line = 11)
    public static final void method147(class30 arg0, int arg1, int arg2) {
        field324++;
        boolean var3 = arg0.method200(false, 1) == 1;
        if (var3) {
            class139.field1805[class207.field2620++] = arg2;
        }
        int var4 = arg0.method200(false, 2);
        class514 var5 = class351.field4490[arg2];
        if (var4 == 0) {
            if (var3) {
                var5.field6978 = false;
            } else if (class167.field2200 == arg2) {
                throw new RuntimeException("s:lr");
            } else {
                class654 var6 = class359.field4571[arg2] = new class654();
                var6.field9228 = (class145.field1879 + var5.field9758[0] >> 6 << 14) + ((var5.field6470 << 28) + (var5.field9754[0] + class630.field8817 >> 6));
                if (var5.field6986 == -1) {
                    var6.field9224 = var5.field9672.method2911((byte) 67);
                } else {
                    var6.field9224 = var5.field6986;
                }
                var6.field9225 = var5.field9650;
                var6.field9223 = var5.field6985;
                if (var5.field7006 > 0) {
                    class534.method2894((byte) 70, var5);
                }
                class351.field4490[arg2] = null;
                if (arg0.method200(false, 1) != 0) {
                    class636.method3562(arg0, arg2, 31261);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg0.method200(false, 3);
            int var8 = var5.field9758[0];
            int var9 = var5.field9754[0];
            if (var7 == 0) {
                var9--;
                var8--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var8++;
                var9++;
            }
            if (var3) {
                var5.field6993 = var8;
                var5.field7000 = var9;
                var5.field6978 = true;
            } else {
                var5.method2776(class492.field6494[arg2], var9, -1157357879, var8);
            }
        } else if (var4 == 2) {
            int var10 = arg0.method200(false, 4);
            int var11 = var5.field9758[0];
            int var12 = var5.field9754[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var11++;
                var12 -= 2;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var11 -= 2;
                var12--;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var11 += 2;
                var12++;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field6978 = true;
                var5.field6993 = var11;
                var5.field7000 = var12;
            } else {
                var5.method2776(class492.field6494[arg2], var12, -1157357879, var11);
            }
        } else {
            int var13 = arg0.method200(false, 1);
            if (var13 == 0) {
                int var14 = arg0.method200(false, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F8) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field9758[0] + var16;
                int var19 = var5.field9754[0] + var17;
                if (var3) {
                    var5.field6978 = true;
                    var5.field7000 = var19;
                    var5.field6993 = var18;
                } else {
                    var5.method2776(class492.field6494[arg2], var19, -1157357879, var18);
                }
                var5.field6470 = var5.field6456 = (byte) (var5.field6470 + var15 & 0x3);
                if (class3.method22(var19, var18, 5706)) {
                    var5.field6456++;
                }
                if (class167.field2200 == arg2) {
                    class476.field6039 = var5.field6470;
                }
            } else {
                int var20 = arg0.method200(false, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFE318) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class145.field1879 + var22 + var5.field9758[0] & 0x3FFF) - class145.field1879;
                int var25 = (var5.field9754[0] + var23 + class630.field8817 & 0x3FFF) - class630.field8817;
                if (var3) {
                    var5.field7000 = var25;
                    var5.field6993 = var24;
                    var5.field6978 = true;
                } else {
                    var5.method2776(class492.field6494[arg2], var25, -1157357879, var24);
                }
                var5.field6470 = var5.field6456 = (byte) (var5.field6470 + var21 & 0x3);
                if (class3.method22(var25, var24, 5706)) {
                    var5.field6456++;
                }
                if (class167.field2200 == arg2) {
                    class476.field6039 = var5.field6470;
                }
                if (arg1 <= -25) {
                    ;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 333)
    public final void method148(int arg0) {
        class450 var2 = this.field323;
        synchronized (this.field323) {
            this.field323.method2406(18385);
        }
        field329++;
        if (arg0 != 4468) {
            this.field323 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 349)
    public final void method149(byte arg0) {
        class450 var2 = this.field323;
        synchronized (this.field323) {
            if (arg0 >= -80) {
                return;
            }
            this.field323.method2412((byte) -119);
        }
        field325++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)Ldn;", line = 365)
    public final class278 method150(byte arg0, int arg1) {
        field327++;
        class450 var3 = this.field323;
        class278 var4;
        synchronized (this.field323) {
            var4 = (class278) this.field323.method2418((long) arg1, (byte) 100);
        }
        if (arg0 < 19) {
            this.field326 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field328;
        byte[] var6;
        synchronized (this.field328) {
            var6 = this.field328.method3365(arg1, 21, 3);
        }
        class278 var7 = new class278();
        var7.field3477 = this;
        if (var6 != null) {
            var7.method1580(64, new class630(var6));
        }
        class450 var8 = this.field323;
        synchronized (this.field323) {
            this.field323.method2409((long) arg1, var7, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Lrf;ILpl;Lpl;)V", line = 414)
    public class21(class112 arg0, int arg1, class612 arg2, class612 arg3) {
        this.field326 = arg3;
        this.field328 = arg2;
        this.field328.method3349(3, true);
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(BI)V", line = 401)
    public final void method151(byte arg0, int arg1) {
        field322++;
        class450 var3 = this.field323;
        synchronized (this.field323) {
            this.field323.method2411(true, arg1);
            if (arg0 > -53) {
                this.method150((byte) -66, 125);
            }
        }
    }
}
