import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class9 {

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Ldc;")
    public class22 field139 = new class22();

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Lva;")
    private static class121 field145 = class107.method797("Please check your message)2centre for details)3", -10983);

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "Z")
    public static boolean field146 = false;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "Z")
    public static boolean field140 = false;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Lva;")
    private static class121 field149 = class107.method797("Ok", -10983);

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "Z")
    public static boolean field151 = false;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "Lva;")
    private static class121 field147 = class107.method797("Bad session id)3", -10983);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field133 = 0;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "Lva;")
    public static class121 field153 = field149;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "Lva;")
    public static class121 field156 = field145;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Lva;")
    public static class121 field135 = field147;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!bb", name = "B", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Ldc;")
    private class22 field160;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)Ldc;", line = 5)
    public final class22 method55(int arg0) {
        class22 var2 = this.field139.field575;
        if (arg0 != 3) {
            field140 = false;
        }
        field157++;
        if (this.field139 == var2) {
            this.field160 = null;
            return null;
        } else {
            this.field160 = var2.field575;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIBII)V", line = 32)
    public static final void method56(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field158++;
        int var6 = class58.field1348.method739(arg5, arg1, arg0);
        if (var6 != 0) {
            int var7 = class58.field1348.method741(arg5, arg1, arg0, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = var7 & 0x1F;
            int var10 = arg2;
            if (var6 > 0) {
                var10 = arg4;
            }
            int[] var11 = class63.field1522.field164;
            int var12 = var6 >> 14 & 0x7FFF;
            class59 var13 = class20.method179(arg3 ^ 0x15, var12);
            int var14 = (52736 - arg0 * 512) * 4 + arg1 * 4 + 24624;
            if (var13.field1385 == -1) {
                if (var9 == 0 || var9 == 2) {
                    if (var8 == 0) {
                        var11[var14] = var10;
                        var11[var14 + 512] = var10;
                        var11[var14 + 1024] = var10;
                        var11[var14 + 1536] = var10;
                    } else if (var8 == 1) {
                        var11[var14] = var10;
                        var11[var14 + 1] = var10;
                        var11[var14 + 2] = var10;
                        var11[var14 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var14 + 3] = var10;
                        var11[var14 + 512 + 3] = var10;
                        var11[var14 + 1024 + 3] = var10;
                        var11[var14 + 3 + 1536] = var10;
                    } else if (var8 == 3) {
                        var11[var14 + 1536] = var10;
                        var11[var14 + 1536 + 1] = var10;
                        var11[var14 + 1536 + 2] = var10;
                        var11[var14 + 3 + 1536] = var10;
                    }
                }
                if (var9 == 3) {
                    if (var8 == 0) {
                        var11[var14] = var10;
                    } else if (var8 == 1) {
                        var11[var14 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var14 + 1536 + 3] = var10;
                    } else if (var8 == 3) {
                        var11[var14 + 1536] = var10;
                    }
                }
                if (var9 == 2) {
                    if (var8 == 3) {
                        var11[var14] = var10;
                        var11[var14 + 512] = var10;
                        var11[var14 + 1024] = var10;
                        var11[var14 + 1536] = var10;
                    } else if (var8 == 0) {
                        var11[var14] = var10;
                        var11[var14 + 1] = var10;
                        var11[var14 + 2] = var10;
                        var11[var14 + 3] = var10;
                    } else if (var8 == 1) {
                        var11[var14 + 3] = var10;
                        var11[var14 + 3 + 512] = var10;
                        var11[var14 + 3 + 1024] = var10;
                        var11[var14 + 1536 + 3] = var10;
                    } else if (var8 == 2) {
                        var11[var14 + 1536] = var10;
                        var11[var14 + 1537] = var10;
                        var11[var14 + 1536 + 2] = var10;
                        var11[var14 + 1539] = var10;
                    }
                }
            } else {
                class72 var15 = class38.field891[var13.field1385];
                if (var15 != null) {
                    int var16 = (var13.field1387 * 4 - var15.field1690) / 2;
                    int var17 = (var13.field1371 * 4 - var15.field1696) / 2;
                    var15.method502(arg1 * 4 + var17 + 48, 48 - -((-arg0 + 104 + -var13.field1387) * 4) + var16);
                }
            }
        }
        int var18 = class58.field1348.method768(arg5, arg1, arg0);
        if (arg3 != 19) {
            return;
        }
        if (var18 != 0) {
            int var19 = class58.field1348.method741(arg5, arg1, arg0, var18);
            int var20 = var19 >> 6 & 0x3;
            int var21 = var19 & 0x1F;
            int var22 = var18 >> 14 & 0x7FFF;
            class59 var23 = class20.method179(6, var22);
            if (var23.field1385 != -1) {
                class72 var24 = class38.field891[var23.field1385];
                if (var24 != null) {
                    int var25 = (var23.field1371 * 4 - var24.field1696) / 2;
                    int var26 = (var23.field1387 * 4 - var24.field1690) / 2;
                    var24.method502(arg1 * 4 + var25 + 48, (-arg0 + 104 + -var23.field1387) * 4 + 48 + var26);
                }
            } else if (var21 == 9) {
                int var27 = 15658734;
                int var28 = arg1 * 4 + (103 - arg0) * 2048 + 24624;
                if (var18 > 0) {
                    var27 = 15597568;
                }
                int[] var29 = class63.field1522.field164;
                if (var20 == 0 || var20 == 2) {
                    var29[var28 + 1536] = var27;
                    var29[var28 + 1024 + 1] = var27;
                    var29[var28 + 514] = var27;
                    var29[var28 + 3] = var27;
                } else {
                    var29[var28] = var27;
                    var29[var28 + 512 + 1] = var27;
                    var29[var28 + 1026] = var27;
                    var29[var28 + 3 + 1536] = var27;
                }
            }
        }
        int var30 = class58.field1348.method761(arg5, arg1, arg0);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class59 var32 = class20.method179(6, var31);
        if (var32.field1385 == -1) {
            return;
        }
        class72 var33 = class38.field891[var32.field1385];
        if (var33 != null) {
            int var34 = (var32.field1371 * 4 - var33.field1696) / 2;
            int var35 = (var32.field1387 * 4 - var33.field1690) / 2;
            var33.method502(arg1 * 4 + var34 + 48, (104 - arg0 - var32.field1387) * 4 + 48 + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)Ldc;", line = 270)
    public final class22 method57(byte arg0) {
        class22 var2 = this.field139.field579;
        if (arg0 != 86) {
            field145 = null;
        }
        field136++;
        if (this.field139 == var2) {
            this.field160 = null;
            return null;
        } else {
            this.field160 = var2.field579;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)V", line = 292)
    public static void method58(byte arg0) {
        field156 = null;
        field145 = null;
        field135 = null;
        field147 = null;
        field149 = null;
        int var1 = -121 / ((-arg0 - 38) / 52);
        field153 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V", line = 322)
    public static final void method59(int arg0) {
        field150++;
        for (class114 var1 = (class114) class15.field297.method57((byte) 86); var1 != null; var1 = (class114) class15.field297.method66(-29860)) {
            if (class121.field2807 != var1.field2592 || var1.field2586) {
                var1.method187((byte) 39);
            } else if (class115.field2614 >= var1.field2565) {
                var1.method875(class128.field2955, (byte) -85);
                if (var1.field2586) {
                    var1.method187((byte) 39);
                } else {
                    class58.field1348.method730(var1.field2592, var1.field2563, var1.field2581, var1.field2584, 60, var1, 0, -1, false);
                }
            }
        }
        if (arg0 != -3934) {
            field146 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)Ldc;", line = 358)
    public final class22 method60(byte arg0) {
        field152++;
        class22 var2 = this.field139.field575;
        if (arg0 <= 16) {
            return null;
        } else if (this.field139 == var2) {
            return null;
        } else {
            var2.method187((byte) 39);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lbd;", line = 378)
    public static final class11 method61(int arg0, int arg1) {
        field134++;
        class11 var2 = (class11) class81.field1872.method345(arg1 + 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class96.field2156.method315(arg1, true, arg0);
        class11 var4 = new class11();
        if (var3 != null) {
            var4.method90((byte) 117, new class113(var3), arg0);
        }
        var4.method88(false);
        class81.field1872.method350((byte) 123, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V", line = 402)
    public static final void method62(boolean arg0) {
        field154++;
        class8.method45((byte) 77, 0, null, arg0);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldc;I)V", line = 415)
    public final void method63(class22 arg0, int arg1) {
        field155++;
        if (arg0.field575 != null) {
            arg0.method187((byte) 39);
        }
        arg0.field579 = this.field139.field579;
        arg0.field575 = this.field139;
        arg0.field575.field579 = arg0;
        arg0.field579.field575 = arg0;
        if (arg1 != 1) {
            field151 = true;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ldc;B)V", line = 432)
    public final void method64(class22 arg0, byte arg1) {
        if (arg0.field575 != null) {
            arg0.method187((byte) 39);
        }
        if (arg1 != 79) {
            return;
        }
        field137++;
        arg0.field579 = this.field139;
        arg0.field575 = this.field139.field575;
        arg0.field575.field579 = arg0;
        arg0.field579.field575 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(BLdc;Ldc;)V", line = 473)
    public final void method65(byte arg0, class22 arg1, class22 arg2) {
        if (arg1.field575 != null) {
            arg1.method187((byte) 39);
        }
        field148++;
        arg1.field579 = arg2;
        arg1.field575 = arg2.field575;
        if (arg0 >= -27) {
            field140 = false;
        }
        arg1.field575.field579 = arg1;
        arg1.field579.field575 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Ldc;", line = 505)
    public final class22 method66(int arg0) {
        class22 var2 = this.field160;
        field143++;
        if (this.field139 == var2) {
            this.field160 = null;
            return null;
        } else if (arg0 == -29860) {
            this.field160 = var2.field579;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)V", line = 531)
    public final void method67(int arg0) {
        field159++;
        if (arg0 != 2) {
            this.method69(65);
        }
        while (true) {
            class22 var2 = this.field139.field579;
            if (this.field139 == var2) {
                return;
            }
            var2.method187((byte) 39);
        }
    }

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)Ldc;", line = 551)
    public final class22 method68(int arg0) {
        field144++;
        class22 var2 = this.field139.field579;
        if (this.field139 == var2) {
            return null;
        } else {
            var2.method187((byte) 39);
            return arg0 == 5416 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V", line = 605)
    public class9() {
        this.field139.field579 = this.field139;
        this.field139.field575 = this.field139;
    }

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)Ldc;", line = 583)
    public final class22 method69(int arg0) {
        int var2 = 23 % (arg0 / 59);
        field138++;
        class22 var3 = this.field160;
        if (this.field139 == var3) {
            this.field160 = null;
            return null;
        } else {
            this.field160 = var3.field575;
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZ[BI)V", line = 617)
    public static final void method70(int arg0, int arg1, boolean arg2, byte[] arg3, int arg4) {
        field141++;
        if (class5.field89 == null) {
            return;
        }
        if (arg1 >= ~class66.field1594) {
            arg0 -= 20;
            if (arg0 < 1) {
                arg0 = 1;
            }
            class97.field2164 = arg0;
            if (class66.field1594 == 0) {
                class77.field1791 = 0;
            } else {
                int var5 = class67.method475(class66.field1594, ~arg1);
                int var6 = var5 - class28.field711;
                class77.field1791 = (class77.field1791 + var6 + 3600 - 1) / class77.field1791;
            }
            class66.field1591 = arg2;
            class48.field1162 = arg3;
            class95.field2110 = arg4;
        } else if (class97.field2164 == 0) {
            class8.method45((byte) -76, arg4, arg3, arg2);
        } else {
            class66.field1591 = arg2;
            class48.field1162 = arg3;
            class95.field2110 = arg4;
        }
    }
}
