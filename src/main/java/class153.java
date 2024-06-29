import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class153 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Lgg;")
    private class114 field1856 = new class114(64);

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lkha;")
    private class687 field1859;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public int field1861;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "F")
    public static float field1857;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "J")
    public static long field1858;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Z")
    public static boolean field1863;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)V")
    public final void method946(int arg0, int arg1) {
        class114 var3 = this.field1856;
        synchronized (this.field1856) {
            if (arg0 != -2) {
                field1857 = 0.17085306F;
            }
            this.field1856.method775(1, arg1);
        }
        field1867++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public final void method947(boolean arg0) {
        field1866++;
        class114 var2 = this.field1856;
        synchronized (this.field1856) {
            this.field1856.method776((byte) 100);
        }
        if (!arg0) {
            this.method947(false);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V")
    public static final void method948(byte arg0) {
        if (arg0 == 117) {
            field1860++;
            class518.field7289.method139(((float) class223.field2944.field598.method992((byte) -121) * 0.1F + 0.7F) * class238.field3075);
            class518.field7289.method85(class244.field3139, field1857, class306.field3937, (float) (class394.field5489 << 2), (float) (class513.field7234 << 2), (float) (class553.field7770 << 2));
            class518.field7289.method170(class669.field9153);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public final void method949(int arg0) {
        class114 var2 = this.field1856;
        synchronized (this.field1856) {
            if (arg0 != 7237) {
                method948((byte) -78);
            }
            this.field1856.method781((byte) 47);
        }
        field1865++;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([[[BIZZI[I[IIIBI[II[IIII[I)V")
    public static final void method950(byte[][][] arg0, int arg1, boolean arg2, boolean arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8, byte arg9, int arg10, int[] arg11, int arg12, int[] arg13, int arg14, int arg15, int arg16, int[] arg17) {
        field1862++;
        if (class709.field9973 == -1) {
            return;
        }
        int[] var18 = class422.field5998.method71();
        int var19 = var18[arg10];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = var21;
        int var24 = var22;
        if (class709.field9973 == 1) {
            var23 = (int) ((double) class210.field2691 * (double) var21 / (double) class162.field2073);
            var24 = (int) ((double) class210.field2691 * (double) var22 / (double) class162.field2073);
        }
        if (!class571.field7967) {
            if (class709.field9973 == 1) {
                class404.method2398(arg10 ^ 0xFFFF8C2B);
            }
            int var25 = arg7 - class746.field10430;
            int var26 = arg15 - class397.field5514;
            int var27 = arg8 - class365.field5175;
            int var28 = (int) (((double) var27 * class529.field7466 + (double) var25 * class332.field4283 + (double) var26 * class649.field8923) * (double) var23 / (double) arg16);
            int var29 = (int) (((double) var27 * class747.field10442 + (double) var25 * class206.field2649 + (double) var26 * class728.field10192) * (double) var24 / (double) arg16);
            double var30 = (double) var27 * class503.field7083 + (double) var25 * class213.field2710 + (double) var26 * class38.field566;
            int var32 = class687.field9708 + var28 - class105.field1291;
            int var33 = class115.field1420 + var29 - class745.field10399;
            int var34 = var32 + class199.field2547;
            int var35 = class210.field2691 + var33;
            if (!(var32 < 0 || var33 < 0 || class635.field8800 < var34 || class162.field2073 < var35) || class709.field9973 == 2) {
                if (class709.field9973 == 2) {
                    class88.field1116 = -var30;
                }
                class314.field4027 = var32;
                class437.field6143 = var33;
            } else if (var34 > 0 && var35 > 0 && class635.field8800 > var32 && var33 < class162.field2073) {
                int var36 = var32 - class687.field9708;
                int var37 = var33 - class115.field1420;
                int var38 = 0;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                double var42 = 0.0D;
                if (class709.field9973 == 0) {
                    var42 = class88.field1116 + var30;
                    var38 = var36;
                    var39 = var37;
                } else if (class709.field9973 == 1) {
                    var40 = var36 / class112.field1383;
                    var41 = var37 / class664.field9087;
                    var39 = class664.field9087 * var41;
                    var38 = class112.field1383 * var40;
                    var42 = (class88.field1116 + var30) * (double) (var36 * var38 + (var37 * var39)) / (double) (var36 * var36 + var37 * var37);
                }
                double var44 = -var42;
                int var46 = 0;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52;
                int var53;
                int var54;
                int var55;
                if (var38 < 0) {
                    var52 = -var38;
                    var53 = class635.field8800 + var38;
                    var54 = 0;
                    if (class709.field9973 == 1) {
                        var50 = -var40;
                        var48 = 0;
                    }
                    var55 = var52;
                } else {
                    var53 = class635.field8800 - var38;
                    var52 = 0;
                    var54 = var53;
                    if (class709.field9973 == 1) {
                        var48 = class680.field9231 - var40;
                        var50 = var40;
                    }
                    var55 = var38;
                }
                int var56;
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                if (var39 < 0) {
                    var56 = -var39;
                    var57 = class162.field2073 + var39;
                    var58 = 0;
                    var59 = var56;
                    if (class709.field9973 == 1) {
                        var47 = -var41;
                        var46 = 0;
                        var51 = class665.field9109 + var41;
                        var49 = var47;
                    }
                    var60 = var57;
                    var61 = var56;
                } else {
                    var57 = class162.field2073 - var39;
                    var56 = 0;
                    var60 = var57;
                    var61 = 0;
                    if (class709.field9973 == 1) {
                        var46 = class665.field9109 - var41;
                        var49 = 0;
                        var47 = var41;
                        var51 = var46;
                    }
                    var59 = var39;
                    var58 = var57;
                }
                class314 var62 = class220.field2793.field8623;
                for (class607 var63 = (class607) var62.method1839(-122); var63 != null; var63 = (class607) var62.method1836((byte) -26)) {
                    class678[] var69 = var63.field8425;
                    boolean var70 = true;
                    for (int var71 = 0; var71 < var69.length; var71++) {
                        class678 var72 = var69[var71];
                        int var73 = var72.field9207;
                        int var74 = var72.field9203;
                        int var75 = var72.field9205;
                        int var76 = var72.field9204;
                        int var77;
                        var72.field9207 = var77 = var73 - var38;
                        int var78 = var72.field9206;
                        int var79;
                        var72.field9205 = var79 = var75 - var38;
                        int var80;
                        var72.field9203 = var80 = var74 - var39;
                        int var81;
                        var72.field9204 = var81 = var76 - var39;
                        if (var70) {
                            int var82 = (var79 > var77 ? var77 : var79) - var78;
                            if (var82 <= class635.field8800) {
                                int var83 = (var80 >= var81 ? var81 : var80) - var78;
                                if (class162.field2073 >= var83) {
                                    int var84 = (var77 >= var79 ? var77 : var79) + var78;
                                    if (var84 >= 0) {
                                        int var85 = (var80 >= var81 ? var80 : var81) + var78;
                                        if (var85 >= 0) {
                                            var70 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var70) {
                        var63.method3869(true);
                        class87.method610(var63, 0);
                    }
                }
                if (class709.field9973 == 0) {
                    class422.field5998.method111(class297.field3856);
                }
                class422.field5998.method105(-var38, -var39);
                class422.field5998.method120(var52, var56, var53, var57, var44);
                class91.method630(class88.field1116 + var44, 86);
                class733.field10246 = class88.field1116 + var44;
                if (class709.field9973 == 1) {
                    class17.field230 = var20 - class745.field10399 - var39;
                    class643.field8878 = var24;
                    class347.field4491 = var23;
                    class73.field959 = var19 - class105.field1291 - var38;
                    class422.field5998.method117(class73.field959, class17.field230, class347.field4491, class643.field8878);
                } else {
                    class347.field4491 = var23;
                    class643.field8878 = var24;
                    class17.field230 = class115.field1420 + var20 - var39 - class745.field10399;
                    class73.field959 = class687.field9708 + var19 - class105.field1291 - var38;
                    class422.field5998.method117(class73.field959, class17.field230, class347.field4491, class643.field8878);
                }
                class302.method1781(class220.field2793);
                if (var59 > 0) {
                    class422.field5998.method131(0, var58, class635.field8800, var58 + var59);
                    class422.field5998.method99();
                    class422.field5998.method166(class139.field1661);
                    class579.method3233(arg12, arg7, arg15, arg8, arg0, arg11, arg6, arg13, arg17, arg5, arg4, arg9, arg1, arg14, arg3, arg2, arg16, 1, false);
                }
                if (var55 > 0) {
                    class422.field5998.method131(var54, var61, var54 + var55, var60 + var61);
                    class422.field5998.method99();
                    class422.field5998.method166(class139.field1661);
                    class579.method3233(arg12, arg7, arg15, arg8, arg0, arg11, arg6, arg13, arg17, arg5, arg4, arg9, arg1, arg14, arg3, arg2, arg16, 1, false);
                }
                class422.field5998.method59();
                class713.method3949();
                if (class709.field9973 == 0) {
                    class422.field5998.method62();
                }
                class745.field10399 += var39;
                class88.field1116 += var44;
                class105.field1291 += var38;
                class437.field6143 = class115.field1420 + var29 - class745.field10399;
                class314.field4027 = class687.field9708 + var28 - class105.field1291;
                if (class709.field9973 == 1) {
                    class304.field3930 += var41;
                    class117.field1427 += var40;
                    for (int var64 = 0; var64 < class665.field9109; var64++) {
                        int var65 = class222.method1440(class665.field9109, class304.field3930 + var64, -31781) * class680.field9231;
                        for (int var66 = 0; var66 < class680.field9231; var66++) {
                            int var67 = var65 + class222.method1440(class680.field9231, class117.field1427 + var66, -31781);
                            boolean var68 = var64 >= var46 && var64 < var46 + var47 || var64 >= var49 && (var49 + var51) > var64 && var66 >= var48 && (var48 + var50) > var66;
                            class641.field8860[var67].method335(class112.field1383 * var66, class664.field9087 * var64, class112.field1383, class664.field9087, 0, 0, var68, true);
                        }
                    }
                }
            } else {
                class571.field7967 = true;
            }
        }
        if (class571.field7967) {
            class745.field10399 = 0;
            class437.field6143 = class115.field1420;
            class314.field4027 = class687.field9708;
            class746.field10430 = arg7;
            class365.field5175 = arg8;
            class397.field5514 = arg15;
            class88.field1116 = 0.0D;
            class105.field1291 = 0;
            if (class709.field9973 == 0) {
                class422.field5998.method111(class297.field3856);
            }
            class422.field5998.method59();
            class422.field5998.method99();
            class422.field5998.method166(class139.field1661);
            class351.field4604.method1966(class746.field10430, class397.field5514, class365.field5175, class718.field10118, class41.field583, class580.field8062);
            class422.field5998.method77(class351.field4604);
            if (class709.field9973 == 1) {
                class17.field230 = var20;
                class73.field959 = var19;
                class347.field4491 = var23;
                class643.field8878 = var24;
                class422.field5998.method117(class73.field959, class17.field230, class347.field4491, class643.field8878);
            } else {
                class643.field8878 = var24;
                class73.field959 = var19 + class687.field9708;
                class17.field230 = var20 + class115.field1420;
                class347.field4491 = var23;
                class422.field5998.method117(class73.field959, class17.field230, class347.field4491, class643.field8878);
            }
            class733.field10246 = 0.0D;
            class220.field2793.method3381(2);
            class302.method1781(class220.field2793);
            class579.method3233(arg12, arg7, arg15, arg8, arg0, arg11, arg6, arg13, arg17, arg5, arg4, arg9, arg1, arg14, arg3, arg2, arg16, 1, false);
            class713.method3949();
            class571.field7967 = false;
            if (class709.field9973 == 0) {
                class422.field5998.method62();
            }
            if (class709.field9973 == 1) {
                class529.method3024(-38);
            }
        }
        if (class709.field9973 == 0) {
            class297.field3856.method332(class314.field4027, class437.field6143, class199.field2547, class210.field2691, 0, 0, true, true);
        }
        class743.field10378++;
        class91.method630(class88.field1116, -35);
        class221.field2879 = class88.field1116;
        if (class709.field9973 == 0 || class709.field9973 == 2) {
            if (class709.field9973 == 2) {
                class422.field5998.method166(class139.field1661);
                class422.field5998.method99();
            }
            class715.field10076 = var19 - class314.field4027 - (-class687.field9708 + class105.field1291);
            class154.field1873 = class115.field1420 + var20 - class745.field10399 - class437.field6143;
            class748.field10466 = var24;
            class681.field9269 = var23;
            class422.field5998.method117(class715.field10076, class154.field1873, class681.field9269, class748.field10466);
        } else if (class709.field9973 == 1) {
            class715.field10076 = var19 - class105.field1291;
            class748.field10466 = var24;
            class681.field9269 = var23;
            class154.field1873 = var20 - class745.field10399;
            class422.field5998.method117(class715.field10076, class154.field1873, class681.field9269, class748.field10466);
            class422.field5998.method131(class314.field4027, class437.field6143, class314.field4027 + class199.field2547, class437.field6143 + class210.field2691);
        }
        class579.method3233(arg12, arg7, arg15, arg8, arg0, arg11, arg6, arg13, arg17, arg5, arg4, arg9, arg1, arg14, arg3, arg2, arg16, class709.field9973 == 2 ? 0 : 2, class709.field9973 == 1);
        class422.field5998.method59();
        class422.field5998.method117(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)Ljc;")
    public final class498 method951(int arg0, int arg1) {
        field1855++;
        class114 var3 = this.field1856;
        class498 var4;
        synchronized (this.field1856) {
            if (arg0 < 33) {
                field1858 = 62L;
            }
            var4 = (class498) this.field1856.method778((long) arg1, 121);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field1859;
        byte[] var6;
        synchronized (this.field1859) {
            var6 = this.field1859.method3810(16, -23360, arg1);
        }
        class498 var7 = new class498();
        if (var6 != null) {
            var7.method2892(new class179(var6), (byte) 74);
        }
        class114 var8 = this.field1856;
        synchronized (this.field1856) {
            this.field1856.method774((long) arg1, -63, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Ldh;ILkha;)V")
    public class153(class286 arg0, int arg1, class687 arg2) {
        this.field1859 = arg2;
        if (this.field1859 == null) {
            this.field1861 = 0;
        } else {
            this.field1861 = this.field1859.method3812(0, 16);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZJ)V")
    public static final void method952(boolean arg0, long arg1) {
        field1864++;
        int var3 = class324.field4135;
        if (class742.field10372 != var3) {
            int var4 = var3 - class742.field10372;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var4 > var5) {
                var5 = var4;
            }
            class742.field10372 += var5;
        }
        int var6 = class418.field5941;
        class602.field8360 += (float) arg1 * class591.field8230 / 40.0F * 8.0F;
        if (class175.field2278 != var6) {
            int var7 = var6 - class175.field2278;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var7 < var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class175.field2278 += var8;
        }
        class748.field10471 += (float) arg1 * class661.field9067 / 40.0F * 8.0F;
        class106.method727(arg0);
    }
}
