import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class53 extends class285 {

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "Lwl;")
    public static class81 field820 = new class81(4);

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "Lve;")
    public static class255 field834 = class87.method607(125, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public int field824;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!wf", name = "N", descriptor = "I")
    public static int field827;

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "Lve;")
    public class255 field822;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "[I")
    public static int[] field836;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)I", line = 4)
    public final int method319(int arg0) {
        field832++;
        return arg0 == 22870 ? (int) (this.field3568 >>> 32 & 0xFFL) : 78;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 16)
    public static void method320(int arg0) {
        if (arg0 == 15731) {
            field834 = null;
            field836 = null;
            field820 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(B)V", line = 28)
    public static final void method321(byte arg0) {
        class212.field3611.method553(125);
        field823++;
        if (arg0 > -108) {
            method333(90);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZI)V", line = 44)
    public static final void method322(boolean arg0, int arg1) {
        class101.field1708.method562((byte) 86, arg1);
        field815++;
        if (!arg0) {
            method333(71);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I", line = 57)
    public static final int method323(int arg0, int arg1, int arg2) {
        field816++;
        int var3 = arg1 * arg2 + arg0;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FDB27E) >> 19;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(III)J", line = 71)
    public static final long method324(int arg0, int arg1, int arg2) {
        class249 var3 = class118.field1984[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4188; var4++) {
            class250 var5 = var3.field4182[var4];
            if ((var5.field4206 >> 29 & 0x3L) == 2L && var5.field4212 == arg1 && var5.field4216 == arg2) {
                return var5.field4206;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(B)V", line = 93)
    public final void method325(byte arg0) {
        this.field4903 |= Long.MIN_VALUE;
        int var2 = -102 % ((24 - arg0) / 47);
        field829++;
        if (this.method327((byte) -52) == 0L) {
            class127.field2092.method1923(-8121, this);
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V", line = 111)
    public final void method326(int arg0) {
        int var2 = 8 % ((-arg0 - 40) / 58);
        this.field4903 = this.field4903 & Long.MIN_VALUE | class218.method1541(-117) + 500L;
        field817++;
        class90.field1525.method1923(-8121, this);
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(B)J", line = 122)
    public final long method327(byte arg0) {
        field830++;
        if (arg0 != -52) {
            method332((class255) null, -81);
        }
        return Long.MAX_VALUE & this.field4903;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V", line = 140)
    public class53(int arg0, int arg1) {
        this.field3568 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lrg;IB)Lag;", line = 154)
    public static final class106 method328(class88 arg0, int arg1, byte arg2) {
        field818++;
        byte[] var3 = arg0.method633((byte) -70, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 100) {
                method322(true, -46);
            }
            return new class106(var3);
        }
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V", line = 175)
    public static final void method329(int arg0) {
        field835++;
        if (class128.field2114[96]) {
            class91.field1569 += (-class91.field1569 - 24) / 2;
        } else if (class128.field2114[97]) {
            class91.field1569 += (24 - class91.field1569) / 2;
        } else {
            class91.field1569 /= 2;
        }
        if (class128.field2114[98]) {
            class24.field373 += (12 - class24.field373) / 2;
        } else if (class128.field2114[99]) {
            class24.field373 += (-class24.field373 - 12) / 2;
        } else {
            class24.field373 /= 2;
        }
        class271.field4652 += class24.field373 / 2;
        class76.field1253 += class91.field1569 / 2;
        int var1 = class276.field4742.field5173 + class250.field4218;
        if (arg0 != 16) {
            method328((class88) null, -125, (byte) -87);
        }
        int var2 = class23.field354 + class276.field4742.field5130;
        if (class234.field3863 - var2 < -500 || (class234.field3863 - var2) > 500 || (class16.field243 - var1) < -500 || class16.field243 - var1 > 500) {
            class234.field3863 = var2;
            class16.field243 = var1;
        }
        if (class234.field3863 != var2) {
            class234.field3863 += (var2 - class234.field3863) / 16;
        }
        if (class16.field243 != var1) {
            class16.field243 += (var1 - class16.field243) / 16;
        }
        class148.method1096((byte) -126);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIB)V", line = 225)
    public static final void method330(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class194.field3200[0].method28(arg0, arg1);
        class194.field3200[1].method28(arg0, arg1 + arg3 - 16);
        int var6 = (arg3 - 32) * arg3 / arg2;
        field828++;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg3 - var6 - 32) * arg4 / (arg2 - arg3);
        if (arg5 != -69) {
            method330(57, -92, 123, 87, 103, (byte) -126);
        }
        if (!class281.field4827) {
            class175.method1249(arg0, arg1 + 16, 16, arg3 - 32, class165.field2785);
            class175.method1249(arg0, var7 + arg1 + 16, 16, var6, class77.field1259);
            class175.method1239(arg0, arg1 + var7 + 16, var6, class113.field1915);
            class175.method1239(arg0 + 1, arg1 + 16 + var7, var6, class113.field1915);
            class175.method1242(arg0, arg1 + var7 + 16, 16, class113.field1915);
            class175.method1242(arg0, arg1 + var7 + 17, 16, class113.field1915);
            class175.method1239(arg0 + 15, arg1 - -var7 + 16, var6, class49.field737);
            class175.method1239(arg0 + 14, var7 + 17 + arg1, var6 - 1, class49.field737);
            class175.method1242(arg0, var7 + var6 + arg1 + 15, 16, class49.field737);
            class175.method1242(arg0 + 1, arg1 + 14 + var7 + var6, 15, class49.field737);
            return;
        }
        class126.method936(arg0, arg1 + 16, 16, arg3 - 32, class165.field2785);
        class126.method936(arg0, arg1 + var7 + 16, 16, var6, class77.field1259);
        class126.method937(arg0, arg1 + var7 + 16, var6, class113.field1915);
        class126.method937(arg0 + 1, var7 + 16 + arg1, var6, class113.field1915);
        class126.method939(arg0, var7 + arg1 + 16, 16, class113.field1915);
        class126.method939(arg0, arg1 + var7 + 17, 16, class113.field1915);
        class126.method937(arg0 + 15, arg1 + 16 + var7, var6, class49.field737);
        class126.method937(arg0 + 14, arg1 + 17 + var7, var6 - 1, class49.field737);
        class126.method939(arg0, arg1 + var6 + var7 + 15, 16, class49.field737);
        class126.method939(arg0 + 1, arg1 + 14 + var6 + var7, 15, class49.field737);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I", line = 279)
    public final int method331(boolean arg0) {
        field833++;
        if (!arg0) {
            method320(-35);
        }
        return (int) this.field3568;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lve;I)V", line = 292)
    public static final void method332(class255 arg0, int arg1) {
        field827++;
        int var2 = class187.method1304(arg0, false);
        if (var2 == -1) {
            return;
        }
        class59.field897 = class266.field4506.field837[var2] - class225.field3768;
        class314.field5334 = class41.field636 + class297.field5084 - class266.field4506.field855[var2] - 1;
        int var3 = class59.field897 + ((int) ((float) class285.field4900.field3294 / class59.field905));
        if (arg1 != -16) {
            field820 = (class81) null;
        }
        int var4 = class314.field5334 - ((int) ((float) class285.field4900.field3253 / class59.field905));
        int var5 = class59.field897 - ((int) ((float) class285.field4900.field3294 / class59.field905));
        if (var5 < 0) {
            class59.field897 = (int) ((float) class285.field4900.field3294 / class59.field905);
        }
        int var6 = (int) ((float) class285.field4900.field3253 / class59.field905) + class314.field5334;
        if (class282.field4846 < var3) {
            class59.field897 = class282.field4846 - ((int) ((float) class285.field4900.field3294 / class59.field905));
        }
        if (var4 < 0) {
            class314.field5334 = (int) ((float) class285.field4900.field3253 / class59.field905);
        }
        if (class41.field636 < var6) {
            class314.field5334 = class41.field636 - (int) ((float) class285.field4900.field3253 / class59.field905);
        }
    }

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "(I)V", line = 331)
    public static final void method333(int arg0) {
        if (arg0 != -3354) {
            method321((byte) 0);
        }
        field821++;
        class160.field2692.method1515(7);
        int var1 = class160.field2692.method1513((byte) 45, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class160.field2692.method1513((byte) 45, 2);
        if (var2 == 0) {
            class10.field145[class118.field1985++] = 2047;
        } else if (var2 == 1) {
            int var3 = class160.field2692.method1513((byte) 45, 3);
            class276.field4742.method2100(false, true, var3);
            int var4 = class160.field2692.method1513((byte) 45, 1);
            if (var4 == 1) {
                class10.field145[class118.field1985++] = 2047;
            }
        } else if (var2 == 2) {
            int var9 = class160.field2692.method1513((byte) 45, 3);
            class276.field4742.method2100(true, true, var9);
            int var10 = class160.field2692.method1513((byte) 45, 3);
            class276.field4742.method2100(true, true, var10);
            int var11 = class160.field2692.method1513((byte) 45, 1);
            if (var11 == 1) {
                class10.field145[class118.field1985++] = 2047;
            }
        } else if (var2 == 3) {
            client.field4039 = class160.field2692.method1513((byte) 45, 2);
            int var5 = class160.field2692.method1513((byte) 45, 1);
            int var6 = class160.field2692.method1513((byte) 45, 7);
            int var7 = class160.field2692.method1513((byte) 45, 1);
            if (var7 == 1) {
                class10.field145[class118.field1985++] = 2047;
            }
            int var8 = class160.field2692.method1513((byte) 45, 7);
            class276.field4742.method1687(var6, var8, var5 == 1, (byte) 119);
        }
    }
}
