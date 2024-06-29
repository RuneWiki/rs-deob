import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class127 {

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "Ljda;")
    private class239 field1915 = new class239(64);

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "Ljda;")
    private class239 field1919 = new class239(100);

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Laj;")
    private class333 field1909;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "[Lbu;")
    public static class21[] field1916;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public final void method1026(int arg0) {
        if (arg0 != 0) {
            field1916 = null;
        }
        class239 var2 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method1552(101);
        }
        field1913++;
        class239 var3 = this.field1919;
        synchronized (this.field1919) {
            this.field1919.method1552(90);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
    public static void method1027(int arg0) {
        if (arg0 > 115) {
            field1916 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)V")
    public final void method1028(int arg0, byte arg1) {
        field1908++;
        class239 var3 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method1546(arg0, (byte) -8);
        }
        if (arg1 <= -90) {
            class239 var4 = this.field1919;
            synchronized (this.field1919) {
                this.field1919.method1546(arg0, (byte) -8);
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BILcj;Lha;)V")
    public static final void method1029(byte arg0, int arg1, class723 arg2, class65 arg3) {
        field1917++;
        if (class27.field408 != null && arg1 <= arg2.field10073) {
            for (int var4 = 0; var4 < class27.field408.length; var4++) {
                if (class27.field408[var4] != -1000000 && (class27.field408[var4] >= arg2.field10067[0] || class27.field408[var4] >= arg2.field10067[1] || arg2.field10067[2] <= class27.field408[var4] || arg2.field10067[3] <= class27.field408[var4]) && (class463.field6409[var4] >= arg2.field10066[0] || class463.field6409[var4] >= arg2.field10066[1] || class463.field6409[var4] >= arg2.field10066[2] || class463.field6409[var4] >= arg2.field10066[3]) && (arg2.field10066[0] >= class234.field3168[var4] || class234.field3168[var4] <= arg2.field10066[1] || class234.field3168[var4] <= arg2.field10066[2] || class234.field3168[var4] <= arg2.field10066[3]) && (arg2.field10063[0] <= class191.field2552[var4] || class191.field2552[var4] >= arg2.field10063[1] || arg2.field10063[2] <= class191.field2552[var4] || arg2.field10063[3] <= class191.field2552[var4]) && (arg2.field10063[0] >= class561.field7539[var4] || arg2.field10063[1] >= class561.field7539[var4] || class561.field7539[var4] <= arg2.field10063[2] || class561.field7539[var4] <= arg2.field10063[3])) {
                    return;
                }
            }
        }
        if (arg2.field10059 == 1) {
            int var5 = arg2.field10071 + class174.field2337 - class331.field4776;
            if (var5 >= 0 && class174.field2337 + class174.field2337 >= var5) {
                int var6 = class174.field2337 + arg2.field10072 - class76.field1102;
                if (var6 < 0) {
                    var6 = 0;
                } else if ((class174.field2337 + class174.field2337) < var6) {
                    return;
                }
                int var7 = arg2.field10058 + class174.field2337 - class76.field1102;
                if (var7 > class174.field2337 + class174.field2337) {
                    var7 = class174.field2337 + class174.field2337;
                } else if (var7 < 0) {
                    return;
                }
                boolean var8 = false;
                while (var6 <= var7) {
                    if (class79.field1122[var5][var6++]) {
                        var8 = true;
                        break;
                    }
                }
                if (var8) {
                    float var9 = (float) (class787.field10837 - arg2.field10066[0]);
                    if (var9 < 0.0F) {
                        var9 *= -1.0F;
                    }
                    if (!(var9 < (float) class782.field10789) && class441.method2658(0, 93, arg2) && class441.method2658(1, 93, arg2) && class441.method2658(2, -102, arg2) && class441.method2658(3, 77, arg2)) {
                        class268.field3958[class675.field9472++] = arg2;
                    }
                }
            }
        } else if (arg2.field10059 == 2) {
            int var10 = arg2.field10072 + class174.field2337 - class76.field1102;
            if (var10 >= 0 && class174.field2337 + class174.field2337 >= var10) {
                int var11 = arg2.field10071 + class174.field2337 - class331.field4776;
                if (var11 < 0) {
                    var11 = 0;
                } else if (var11 > (class174.field2337 + class174.field2337)) {
                    return;
                }
                int var12 = arg2.field10069 + class174.field2337 - class331.field4776;
                if (var12 > (class174.field2337 + class174.field2337)) {
                    var12 = class174.field2337 + class174.field2337;
                } else if (var12 < 0) {
                    return;
                }
                boolean var13 = false;
                while (var12 >= var11) {
                    if (class79.field1122[var11++][var10]) {
                        var13 = true;
                        break;
                    }
                }
                if (var13) {
                    float var14 = (float) (class328.field4759 - arg2.field10063[0]);
                    if (var14 < 0.0F) {
                        var14 *= -1.0F;
                    }
                    if (!((float) class782.field10789 > var14) && class441.method2658(0, 73, arg2) && class441.method2658(1, -113, arg2) && class441.method2658(2, 125, arg2) && class441.method2658(3, 92, arg2)) {
                        class268.field3958[class675.field9472++] = arg2;
                    }
                }
            }
        } else if (arg2.field10059 == 16 || arg2.field10059 == 8) {
            int var23 = arg2.field10071 - (class331.field4776 - class174.field2337);
            if (var23 >= 0 && class174.field2337 + class174.field2337 >= var23) {
                int var24 = arg2.field10072 + class174.field2337 - class76.field1102;
                if (var24 >= 0 && var24 <= class174.field2337 + class174.field2337 && class79.field1122[var23][var24]) {
                    float var25 = (float) (class787.field10837 - arg2.field10066[0]);
                    if (var25 < 0.0F) {
                        var25 *= -1.0F;
                    }
                    float var26 = (float) (class328.field4759 - arg2.field10063[0]);
                    if (var26 < 0.0F) {
                        var26 *= -1.0F;
                    }
                    if (!((float) class782.field10789 > var25) || !((float) class782.field10789 > var26) && class441.method2658(0, 113, arg2) && class441.method2658(1, -52, arg2) && class441.method2658(2, -95, arg2) && class441.method2658(3, -53, arg2)) {
                        class268.field3958[class675.field9472++] = arg2;
                    }
                }
            }
        } else if (arg2.field10059 == 4) {
            float var15 = (float) (arg2.field10067[0] - class632.field8828);
            if (!((float) class678.field9486 >= var15)) {
                int var16 = arg2.field10072 + class174.field2337 - class76.field1102;
                if (var16 < 0) {
                    var16 = 0;
                } else if ((class174.field2337 + class174.field2337) < var16) {
                    return;
                }
                int var17 = arg2.field10058 + class174.field2337 - class76.field1102;
                if (var17 > class174.field2337 + class174.field2337) {
                    var17 = class174.field2337 + class174.field2337;
                } else if (var17 < 0) {
                    return;
                }
                int var18 = class174.field2337 + arg2.field10071 - class331.field4776;
                if (var18 < 0) {
                    var18 = 0;
                } else if ((class174.field2337 + class174.field2337) < var18) {
                    return;
                }
                int var19 = arg2.field10069 + class174.field2337 - class331.field4776;
                if (var19 > class174.field2337 + class174.field2337) {
                    var19 = class174.field2337 + class174.field2337;
                } else if (var19 < 0) {
                    return;
                }
                boolean var20 = false;
                label296: for (int var21 = var18; var21 <= var19; var21++) {
                    for (int var22 = var16; var22 <= var17; var22++) {
                        if (class79.field1122[var21][var22]) {
                            var20 = true;
                            break label296;
                        }
                    }
                }
                if (var20 && class441.method2658(0, -84, arg2) && class441.method2658(1, 73, arg2) && class441.method2658(2, -34, arg2) && class441.method2658(3, -124, arg2)) {
                    class268.field3958[class675.field9472++] = arg2;
                }
            }
        } else if (arg0 > -99) {
            field1916 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Lbs;")
    public final class717 method1030(int arg0, int arg1) {
        field1918++;
        class239 var3 = this.field1919;
        synchronized (this.field1919) {
            if (arg0 != -4849) {
                this.method1026(-122);
            }
            class717 var4 = (class717) this.field1919.method1541(arg0 + 4839, (long) arg1);
            if (var4 == null) {
                var4 = new class717(arg1);
                this.field1919.method1544(true, var4, (long) arg1);
            }
            return var4.method4009((byte) -61) ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V")
    public final void method1031(byte arg0) {
        field1911++;
        class239 var2 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method1555((byte) -3);
        }
        class239 var3 = this.field1919;
        synchronized (this.field1919) {
            this.field1919.method1555((byte) -3);
        }
        if (arg0 != 49) {
            field1916 = null;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI)V")
    public static final void method1032(boolean arg0, int arg1) {
        if (!arg0) {
            method1032(true, -83);
        }
        field1910++;
        class16 var2 = class94.method753(5, 13175, (long) arg1);
        var2.method118(585134072);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BI)V")
    public static final void method1033(byte arg0, int arg1) {
        class300.field4348 = 0;
        class685.field9629 = -1;
        class99.field1374 = 1;
        class482.field6670 = false;
        field1914++;
        int var2 = -49 / ((arg0 - 49) / 44);
        class549.field7445 = null;
        class633.field8849 = null;
        class636.field8868 = -1;
        class311.field4478 = arg1;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)Lvq;")
    public final class489 method1034(int arg0, int arg1) {
        field1912++;
        class239 var3 = this.field1915;
        class489 var4;
        synchronized (this.field1915) {
            var4 = (class489) this.field1915.method1541(-10, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field1909;
        byte[] var6;
        synchronized (this.field1909) {
            var6 = this.field1909.method2095(class30.method219((byte) 28, arg0), class168.method1207(arg0, false), 1);
            if (arg1 != 0) {
                this.field1919 = null;
            }
        }
        class489 var7 = new class489();
        var7.field6774 = this;
        var7.field6784 = arg0;
        if (var6 != null) {
            var7.method2841(new class376(var6), -59);
        }
        var7.method2845(-29692);
        class239 var8 = this.field1915;
        synchronized (this.field1915) {
            this.field1915.method1544(true, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lgia;ILaj;Laj;Laj;)V")
    public class127(class285 arg0, int arg1, class333 arg2, class333 arg3, class333 arg4) {
        this.field1909 = arg2;
        if (this.field1909 != null) {
            int var6 = this.field1909.method2094((byte) -115) - 1;
            this.field1909.method2090(var6, false);
        }
        class9.method71(2, arg4, (byte) -32, arg3);
    }
}
