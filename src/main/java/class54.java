import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class54 extends class107 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhn;IIII)Lba;", line = 4)
    public final class352 method379(class661 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class248(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "()V", line = 7)
    public final void method380() {
        super.field1465 = super.field1440 - super.field1468;
        super.field1445 = super.field1446 - super.field1468;
        super.field1457 = super.field1470 - super.field1442;
        super.field1448 = super.field1450 - super.field1442;
        for (int var1 = 0; var1 < super.field1462; ++var1) {
            class197 var5 = ((class359) super.field1456[var1]).field5139;
            var5.field2911 = super.field1468 - super.field1440;
            var5.field2917 = super.field1442 - super.field1470;
            var5.field2909 = super.field1446 - super.field1440;
            var5.field2918 = super.field1450 - super.field1470;
        }
        int var2 = super.field1470 * super.field1453 + super.field1440;
        for (int var3 = super.field1470; var3 < super.field1450; ++var3) {
            for (int var4 = 0; var4 < super.field1462; ++var4) {
                ((class359) super.field1456[var4]).field5139.field2913[var3 - super.field1470] = var2;
            }
            var2 += super.field1453;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V", line = 45)
    public final void method381(Canvas arg0) {
        if (arg0 != null) {
            class246 var2 = (class246) super.field1428.method2061(-17305, (long) arg0.hashCode());
            if (var2 != null) {
                super.field1429 = arg0;
                super.field1433 = var2;
                if (super.field1447 == null) {
                    super.field1471 = var2.field3503;
                    super.field1453 = var2.field3498;
                    super.field1444 = var2.field3502;
                    this.method805();
                    return;
                }
            }
        } else {
            super.field1429 = null;
            super.field1433 = null;
            if (super.field1447 == null) {
                super.field1471 = null;
                super.field1453 = super.field1444 = 1;
                this.method805();
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 79)
    public final void method382(int arg0) {
        super.field1456[arg0].method172((byte) -90, Thread.currentThread());
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ld;", line = 82)
    public final class136 method383(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class223(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIII)V", line = 86)
    public final void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class359 var11 = (class359) this.method392(Thread.currentThread());
        class197 var12 = var11.field5139;
        var12.field2914 = false;
        var12.field2908 = true;
        int var13 = arg0 - super.field1465;
        int var14 = arg2 - super.field1465;
        int var15 = arg4 - super.field1465;
        int var16 = arg1 - super.field1457;
        int var17 = arg3 - super.field1457;
        int var18 = arg5 - super.field1457;
        int var19 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var19 == 255) {
            var12.field2910 = 0;
            var12.field2921 = false;
            var12.method1336(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else if (arg9 == 1) {
            var12.field2910 = 255 - var19;
            var12.field2921 = false;
            var12.method1336(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        } else {
            if (arg9 != 2) {
                throw new IllegalArgumentException();
            }
            var12.field2910 = 128;
            var12.field2921 = true;
            var12.method1336(var16, var17, var18, var13, var14, var15, arg6, arg7, arg8);
        }
        var12.field2914 = true;
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z", line = 127)
    public final boolean method385() {
        return false;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V", line = 130)
    public final void method386(int arg0) {
        super.field1462 = arg0;
        super.field1456 = new class359[super.field1462];
        for (int var2 = 0; var2 < super.field1462; ++var2) {
            super.field1456[var2] = new class359(this);
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)V", line = 142)
    public final void method387(boolean arg0) {
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V", line = 146)
    public final void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class359 var8 = (class359) this.method392(Thread.currentThread());
        class197 var9 = var8.field5139;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            int var17 = (var15 >> 16) + var10;
            int var18 = (var16 >> 16) + var11;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var19 = arg5 * var16 >> 17;
            int var20 = arg5 * var16 + 1 >> 17;
            int var21 = arg5 * var15 >> 17;
            int var22 = arg5 * var15 + 1 >> 17;
            int var23 = arg0 - var9.method1337();
            int var24 = arg1 - var9.method1330();
            int var25 = var19 + var23;
            int var26 = var23 - var20;
            int var27 = var17 + var23 - var20;
            int var28 = var17 + var23 + var19;
            int var29 = var21 + var24;
            int var30 = var24 - var22;
            int var31 = var18 + var24 - var22;
            int var32 = var18 + var24 + var21;
            if (arg6 == 0) {
                var9.field2910 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field2910 = 255 - (arg4 >>> 24);
            }
            var9.field2908 = var25 < 0 || var25 > var9.field2909 || var26 < 0 || var26 > var9.field2909 || var27 < 0 || var27 > var9.field2909;
            var9.method1327(var29, var30, var31, var25, var26, var27, arg4);
            var9.field2908 = var25 < 0 || var25 > var9.field2909 || var27 < 0 || var27 > var9.field2909 || var28 < 0 || var28 > var9.field2909;
            var9.method1327(var29, var31, var32, var25, var27, var28, arg4);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcq;IIII)V", line = 218)
    public final void method389(class429 arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = arg0.field6024;
        int var8 = arg4 << 1;
        if (var6 == -1) {
            this.method477(arg1, arg2, arg4, arg0.field6023, 1);
        } else {
            if (super.field1477 != var6) {
                class461 var9 = (class461) super.field1469.method1986((byte) -119, (long) var6);
                if (var9 == null) {
                    int[] var10 = this.method807(var6);
                    if (var10 == null) {
                        return;
                    }
                    int var11 = this.method812(var6) ? 64 : 128;
                    var9 = this.method452(var10, 0, var11, var11, var11);
                    super.field1469.method1985(var9, (long) var6, (byte) -102);
                }
                super.field1477 = var6;
                super.field1476 = var9;
            }
            ++var8;
            super.field1476.method35(arg1 - arg4, arg2 - arg4, var8, var8, 0, arg0.field6023, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lba;Lhfa;Lq;[Lrc;I)V", line = 257)
    public final void method390(class352[] arg0, class281 arg1, class391 arg2, class494[] arg3, int arg4) {
        class248[] var6 = new class248[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class248) arg0[var7];
            }
        }
        class248 var8 = class248.method1534(this, var6);
        var8.method3536(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIIIIIII)V", line = 272)
    public final void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 != 0 && arg4 != 0) {
            if (arg6 != 65535 && !super.field9050.method588(-26679, arg6).field3821) {
                if (super.field1477 != arg6) {
                    class461 var11 = (class461) super.field1469.method1986((byte) -106, (long) arg6);
                    if (var11 == null) {
                        int[] var12 = this.method807(arg6);
                        if (var12 == null) {
                            return;
                        }
                        int var13 = this.method812(arg6) ? 64 : 128;
                        var11 = this.method452(var12, 0, var13, var13, var13);
                        super.field1469.method1985(var11, (long) arg6, (byte) -102);
                    }
                    super.field1477 = arg6;
                    super.field1476 = var11;
                }
                super.field1476.method35(arg0 - arg3, arg1 - arg4, arg3 << 1, arg4 << 1, arg8, arg7, arg9);
            } else {
                this.method477(arg0, arg1, arg3, arg7, arg9);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/Runnable;)Lvd;", line = 307)
    public final class36 method392(Runnable arg0) {
        for (int var2 = 0; var2 < super.field1462; ++var2) {
            if (super.field1456[var2].field455 == arg0) {
                return super.field1456[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Lba;Lq;[Lrc;I)V", line = 320)
    public final void method393(class352[] arg0, class391 arg1, class494[] arg2, int arg3) {
        class248[] var5 = new class248[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class248) arg0[var6];
            }
        }
        class248 var7 = class248.method1534(this, var5);
        var7.method3536(arg1, arg2 != null ? arg2[0] : null, (class281) null, arg3);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ljava/awt/Canvas;Le;)V", line = 337)
    public class54(Canvas arg0, class489 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 340)
    public final void method394(int arg0) {
        super.field1456[arg0].method172((byte) -87, (Runnable) null);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Ljava/awt/Canvas;)V", line = 345)
    public final void method395(Canvas arg0) {
        class246 var2 = (class246) super.field1428.method2061(-17305, (long) arg0.hashCode());
        if (var2 != null) {
            var2.method2971(1);
            class246 var3 = class397.method2257(75, arg0);
            super.field1428.method2063((long) arg0.hashCode(), 1, var3);
            if (super.field1429 == arg0 && super.field1447 == null) {
                super.field1433 = var3;
                super.field1471 = var3.field3503;
                super.field1453 = var3.field3498;
                super.field1444 = var3.field3502;
                this.method805();
            }
        }
    }
}
