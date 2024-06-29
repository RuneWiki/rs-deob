import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class244 extends class282 implements class2 {

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Loa;")
    private class406 field3934;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lya;")
    private class71 field3931;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "[Lou;")
    public class157[] field3933;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "[Lsn;")
    public class158[] field3932;

    @OriginalMember(owner = "client!i", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()[Lou;", line = 12)
    public final class157[] method1020() {
        return this.field3933;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILtc;ZII)Z", line = 17)
    public final boolean method1023(int arg0, int arg1, class73 arg2, boolean arg3, int arg4, int arg5) {
        return this.field3934.method2509().method1210(this, arg0, arg1, arg2, arg3, arg5);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILtc;ZI)Z", line = 20)
    public final boolean method1010(int arg0, int arg1, class73 arg2, boolean arg3, int arg4) {
        return this.field3934.method2509().method1206(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z", line = 24)
    public final boolean method1051() {
        return true;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()V", line = 29)
    public final void method1002() {
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([ILtc;)V", line = 36)
    private final void method1692(int[] arg0, class73 arg1) {
        this.field3934.method2509().method1211(this, arg0, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lka;IIIZ)V", line = 40)
    public final void method1031(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3934.method2509().method1208(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltc;Lqw;I)V", line = 50)
    public final void method1007(class73 arg0, class385 arg1, int arg2) {
        if (arg1 == null) {
            this.field3934.method2509().method1225(this, arg0, (int[]) null, arg2);
        } else {
            class406.field6018[5] = 0;
            this.field3934.method2509().method1225(this, arg0, class406.field6018, arg2);
            arg1.field5764 = class406.field6018[0];
            arg1.field5766 = class406.field6018[1];
            arg1.field5767 = class406.field6018[2];
            arg1.field5765 = class406.field6018[3];
            arg1.field5769 = class406.field6018[4];
            arg1.field5768 = class406.field6018[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltc;)V", line = 67)
    public final void method1028(class73 arg0) {
        this.method1692(class406.field6014, arg0);
        int var2 = 0;
        if (this.field3933 != null) {
            for (int var3 = 0; var3 < this.field3933.length; ++var3) {
                class157 var4 = this.field3933[var3];
                var4.field2438 = class406.field6014[var2++];
                var4.field2431 = class406.field6014[var2++];
                var4.field2445 = class406.field6014[var2++];
                var4.field2443 = class406.field6014[var2++];
                var4.field2435 = class406.field6014[var2++];
                var4.field2427 = class406.field6014[var2++];
                var4.field2439 = class406.field6014[var2++];
                var4.field2430 = class406.field6014[var2++];
                var4.field2436 = class406.field6014[var2++];
            }
        }
        if (this.field3932 != null) {
            for (int var5 = 0; var5 < this.field3932.length; ++var5) {
                class158 var6 = this.field3932[var5];
                class158 var7 = var6;
                if (var6.field2450 != null) {
                    var7 = var6.field2450;
                }
                if (var6.field2449 != null) {
                    var6.field2449.method673(arg0);
                } else {
                    var6.field2449 = arg0.method663();
                }
                var7.field2455 = class406.field6014[var2++];
                var7.field2448 = class406.field6014[var2++];
                var7.field2454 = class406.field6014[var2++];
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltc;IZ)V", line = 126)
    public final void method1032(class73 arg0, int arg1, boolean arg2) {
        this.method1696(((class132) arg0).nativeid, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[IIIIIZ)V", line = 131)
    public final void method1011(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.method1691(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BIZ)Lka;", line = 138)
    public final class282 method1025(byte arg0, int arg1, boolean arg2) {
        return this.field3934.method2509().method1200(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ltc;Lqw;II)V", line = 144)
    public final void method1026(class73 arg0, class385 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field3934.method2509().method1209(this, arg0, (int[]) null, arg2, arg3);
        } else {
            class406.field6018[5] = 0;
            this.field3934.method2509().method1209(this, arg0, class406.field6018, arg2, arg3);
            arg1.field5764 = class406.field6018[0];
            arg1.field5766 = class406.field6018[1];
            arg1.field5767 = class406.field6018[2];
            arg1.field5765 = class406.field6018[3];
            arg1.field5769 = class406.field6018[4];
            arg1.field5768 = class406.field6018[5] != 0;
        }
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()V", line = 160)
    public final void method1000() {
        if (this.field3934.field6027 > 1) {
            synchronized (this) {
                super.field4373 = false;
                this.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;Lya;Lb;IIII)V", line = 174)
    public class244(class406 arg0, class71 arg1, class352 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3934 = arg0;
        this.field3931 = arg1;
        this.field3933 = arg2.field5153;
        this.field3932 = arg2.field5191;
        int var8 = arg2.field5153 == null ? 0 : arg2.field5153.length;
        int var9 = arg2.field5191 == null ? 0 : arg2.field5191.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; ++var12) {
            var11[var10++] = this.field3933[var12].field2444;
            var11[var10++] = this.field3933[var12].field2432;
            var11[var10++] = this.field3933[var12].field2429;
        }
        for (int var13 = 0; var13 < var9; ++var13) {
            var11[var10++] = this.field3932[var13].field2451;
        }
        int var14 = arg2.field5189 == null ? 0 : arg2.field5189.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; ++var17) {
            class562 var20 = arg2.field5189[var17];
            class355 var21 = class176.method1378(var20.field7954, (byte) 87);
            var15[var16++] = var20.field7964;
            var15[var16++] = var21.field5381;
            var15[var16++] = var21.field5383;
            var15[var16++] = var21.field5378;
            var15[var16++] = var21.field5382;
            var15[var16++] = var21.field5379;
            var15[var16++] = var21.field5374 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; ++var18) {
            class562 var19 = arg2.field5189[var18];
            var15[var16++] = var19.field7958;
        }
        this.method1694(this.field3934, this.field3931, arg2.field5180, arg2.field5145, arg2.field5159, arg2.field5175, arg2.field5164, arg2.field5194, arg2.field5160, arg2.field5186, arg2.field5150, arg2.field5177, arg2.field5183, arg2.field5167, arg2.field5143, arg2.field5196, arg2.field5195, arg2.field5161, arg2.field5168, arg2.field5178, arg2.field5176, arg2.field5154, arg2.field5166, arg2.field5162, arg2.field5156, arg2.field5155, arg2.field5152, arg2.field5185, arg2.field5190, arg2.field5172, arg2.field5165, arg2.field5188, arg2.field5174, arg2.field5157, arg2.field5169, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Loa;)V", line = 245)
    public class244(class406 arg0) {
        this.field3934 = arg0;
        this.field3931 = null;
        this.method1695(arg0);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V", line = 251)
    public final void method1022() {
        if (this.field3934.field6027 > 1) {
            synchronized (this) {
                while (super.field4373) {
                    try {
                        this.wait();
                    } catch (InterruptedException var2) {
                    }
                }
                super.field4373 = true;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()[Lsn;", line = 270)
    public final class158[] method1036() {
        return this.field3932;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 273)
    public final void method997(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!i", name = "finalize", descriptor = "()V", line = 276)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class389.method2431(this, 103);
        }
    }

    @OriginalMember(owner = "client!i", name = "RA", descriptor = "()I")
    public final native int method1024();

    @OriginalMember(owner = "client!i", name = "ua", descriptor = "()I")
    public final native int method1044();

    @OriginalMember(owner = "client!i", name = "LA", descriptor = "(I)V")
    public final native void method1046(int arg0);

    @OriginalMember(owner = "client!i", name = "da", descriptor = "()I")
    public final native int method1056();

    @OriginalMember(owner = "client!i", name = "ia", descriptor = "(SS)V")
    public final native void method1018(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "I", descriptor = "(I[IIIIZI[I)V")
    public final native void method1009(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!i", name = "H", descriptor = "(III)V")
    public final native void method1047(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "()V")
    public final native void method1016();

    @OriginalMember(owner = "client!i", name = "r", descriptor = "()Z")
    public final native boolean method1054();

    @OriginalMember(owner = "client!i", name = "l", descriptor = "(JI[IIIIIZ)V")
    private final native void method1691(long arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7);

    @OriginalMember(owner = "client!i", name = "p", descriptor = "(IILs;Ls;III)V")
    public final native void method1030(int arg0, int arg1, class339 arg2, class339 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!i", name = "fa", descriptor = "()I")
    public final native int method1033();

    @OriginalMember(owner = "client!i", name = "na", descriptor = "()I")
    public final native int method999();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final native void method1019(int arg0);

    @OriginalMember(owner = "client!i", name = "ba", descriptor = "(Lr;)Lr;")
    public final native class706 method1052(class706 arg0);

    @OriginalMember(owner = "client!i", name = "s", descriptor = "(I)V")
    public final native void method1014(int arg0);

    @OriginalMember(owner = "client!i", name = "P", descriptor = "(IIII)V")
    public final native void method1040(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!i", name = "ZA", descriptor = "(Li;Li;IZZ)V")
    public final native void method1693(class244 arg0, class244 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "HA", descriptor = "()I")
    public final native int method996();

    @OriginalMember(owner = "client!i", name = "R", descriptor = "(Loa;Lya;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method1694(class406 arg0, class71 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!i", name = "ma", descriptor = "()I")
    public final native int method1013();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "()Z")
    public final native boolean method1048();

    @OriginalMember(owner = "client!i", name = "aa", descriptor = "(SS)V")
    public final native void method1029(short arg0, short arg1);

    @OriginalMember(owner = "client!i", name = "NA", descriptor = "()Z")
    public final native boolean method1050();

    @OriginalMember(owner = "client!i", name = "V", descriptor = "()I")
    public final native int method1008();

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(III)V")
    public final native void method998(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "wa", descriptor = "()V")
    public final native void method1037();

    @OriginalMember(owner = "client!i", name = "FA", descriptor = "(I)V")
    public final native void method1042(int arg0);

    @OriginalMember(owner = "client!i", name = "oa", descriptor = "(Loa;)V")
    private final native void method1695(class406 arg0);

    @OriginalMember(owner = "client!i", name = "WA", descriptor = "()I")
    public final native int method1035();

    @OriginalMember(owner = "client!i", name = "EA", descriptor = "()I")
    public final native int method1005();

    @OriginalMember(owner = "client!i", name = "D", descriptor = "(JIZ)V")
    private final native void method1696(long arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "(I)V")
    public final native void method1006(int arg0);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "(I)V")
    public final native void method1027(int arg0);

    @OriginalMember(owner = "client!i", name = "G", descriptor = "()I")
    public final native int method1003();

    @OriginalMember(owner = "client!i", name = "VA", descriptor = "(I)V")
    public final native void method1049(int arg0);

    @OriginalMember(owner = "client!i", name = "w", descriptor = "(Z)V")
    public final native void method5(boolean arg0);
}
