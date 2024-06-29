import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class395 extends class536 implements class400 {

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "Lw;")
    private class459 field5985;

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "Lg;")
    private class97 field5987;

    @OriginalMember(owner = "client!xa", name = "m", descriptor = "[Lol;")
    public class293[] field5986;

    @OriginalMember(owner = "client!xa", name = "o", descriptor = "[Lvc;")
    public class100[] field5988;

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "n", descriptor = "(III)V")
    public final native void method269(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "()Z")
    public final boolean method306() {
        return true;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lkk;I)V")
    public final void method295(class205 arg0, class182 arg1, int arg2) {
        if (arg1 == null) {
            this.field5985.method2886().method172(this, arg0, null, arg2);
            return;
        }
        class459.field7068[5] = 0;
        this.field5985.method2886().method172(this, arg0, class459.field7068, arg2);
        arg1.field2644 = class459.field7068[0];
        arg1.field2640 = class459.field7068[1];
        arg1.field2642 = class459.field7068[2];
        arg1.field2645 = class459.field7068[3];
        arg1.field2641 = class459.field7068[4];
        arg1.field2643 = class459.field7068[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Lc;Lkk;II)V")
    public final void method313(class205 arg0, class182 arg1, int arg2, int arg3) {
        if (arg1 == null) {
            this.field5985.method2886().method182(this, arg0, null, arg2, arg3);
            return;
        }
        class459.field7068[5] = 0;
        this.field5985.method2886().method182(this, arg0, class459.field7068, arg2, arg3);
        arg1.field2644 = class459.field7068[0];
        arg1.field2640 = class459.field7068[1];
        arg1.field2642 = class459.field7068[2];
        arg1.field2645 = class459.field7068[3];
        arg1.field2641 = class459.field7068[4];
        arg1.field2643 = class459.field7068[5] != 0;
    }

    @OriginalMember(owner = "client!xa", name = "RA", descriptor = "()I")
    public final native int method308();

    @OriginalMember(owner = "client!xa", name = "X", descriptor = "(I)V")
    public final native void method291(int arg0);

    @OriginalMember(owner = "client!xa", name = "da", descriptor = "(IILya;Lya;III)V")
    public final native void method307(int arg0, int arg1, class223 arg2, class223 arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "q", descriptor = "(SS)V")
    public final native void method309(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "K", descriptor = "(I)V")
    public final native void method319(int arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(BIZ)Le;")
    public final class536 method329(byte arg0, int arg1, boolean arg2) {
        return this.field5985.method2886().method185(this, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(I)V")
    public final native void method290(int arg0);

    @OriginalMember(owner = "client!xa", name = "b", descriptor = "()[Lol;")
    public final class293[] method292() {
        return this.field5986;
    }

    @OriginalMember(owner = "client!xa", name = "KA", descriptor = "()V")
    public final native void method328();

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method298(int arg0, int arg1, class205 arg2, boolean arg3) {
        return this.field5985.method2886().method187(this, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!xa", name = "C", descriptor = "(I)V")
    public final native void method275(int arg0);

    @OriginalMember(owner = "client!xa", name = "za", descriptor = "(IIII)V")
    public final native void method302(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "h", descriptor = "()Z")
    public final native boolean method271();

    @OriginalMember(owner = "client!xa", name = "A", descriptor = "(I)V")
    public final native void method317(int arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(III)V")
    public final native void method325(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!xa", name = "Z", descriptor = "()I")
    public final native int method314();

    @OriginalMember(owner = "client!xa", name = "P", descriptor = "(Lw;Lg;II[I[I[I[I[SI[S[S[S[B[B[B[B[S[S[IB[SI[B[S[S[S[I[I[I[B[B[I[I[I[IIIIIII[I)V")
    private final native void method2551(class459 arg0, class97 arg1, int arg2, int arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, short[] arg8, int arg9, short[] arg10, short[] arg11, short[] arg12, byte[] arg13, byte[] arg14, byte[] arg15, byte[] arg16, short[] arg17, short[] arg18, int[] arg19, byte arg20, short[] arg21, int arg22, byte[] arg23, short[] arg24, short[] arg25, short[] arg26, int[] arg27, int[] arg28, int[] arg29, byte[] arg30, byte[] arg31, int[] arg32, int[] arg33, int[] arg34, int[] arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int[] arg42);

    @OriginalMember(owner = "client!xa", name = "d", descriptor = "()V")
    public final void method303() {
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!xa", name = "MA", descriptor = "()I")
    public final native int method270();

    @OriginalMember(owner = "client!xa", name = "k", descriptor = "()I")
    public final native int method289();

    @OriginalMember(owner = "client!xa", name = "p", descriptor = "()V")
    public final native void method175();

    @OriginalMember(owner = "client!xa", name = "u", descriptor = "(SS)V")
    public final native void method273(short arg0, short arg1);

    @OriginalMember(owner = "client!xa", name = "EA", descriptor = "(Li;)Li;")
    public final native class521 method330(class521 arg0);

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method268(class536 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5985.method2886().method184(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "va", descriptor = "(I[IIIIIZ)V")
    public final native void method288(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

    @OriginalMember(owner = "client!xa", name = "L", descriptor = "()V")
    public final native void method272();

    @OriginalMember(owner = "client!xa", name = "c", descriptor = "()[Lvc;")
    public final class100[] method326() {
        return this.field5988;
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(ILc;)V")
    public final void method2552(int arg0, class205 arg1) {
        int var3 = arg0;
        if (this.field5986 != null) {
            for (int var4 = 0; var4 < this.field5986.length; var4++) {
                class293 var5 = this.field5986[var4];
                var5.field4612 = class459.field7066[var3++];
                var5.field4611 = class459.field7066[var3++];
                var5.field4609 = class459.field7066[var3++];
                var5.field4629 = class459.field7066[var3++];
                var5.field4620 = class459.field7066[var3++];
                var5.field4615 = class459.field7066[var3++];
                var5.field4617 = class459.field7066[var3++];
                var5.field4618 = class459.field7066[var3++];
                var5.field4616 = class459.field7066[var3++];
            }
        }
        if (this.field5988 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5988.length; var6++) {
            class100 var7 = this.field5988[var6];
            class100 var8 = var7;
            if (var7.field1438 != null) {
                var8 = var7.field1438;
            }
            if (var7.field1441 == null) {
                var7.field1441 = arg1.method156();
            } else {
                var7.field1441.method157(arg1);
            }
            var8.field1428 = class459.field7066[var3++];
            var8.field1430 = class459.field7066[var3++];
            var8.field1442 = class459.field7066[var3++];
        }
    }

    @OriginalMember(owner = "client!xa", name = "Y", descriptor = "()I")
    public final native int method323();

    @OriginalMember(owner = "client!xa", name = "ta", descriptor = "()I")
    public final native int method279();

    @OriginalMember(owner = "client!xa", name = "ma", descriptor = "(I)V")
    public final native void method280(int arg0);

    @OriginalMember(owner = "client!xa", name = "SA", descriptor = "(Lxa;Lxa;IZZ)V")
    public final native void method2553(class395 arg0, class395 arg1, int arg2, boolean arg3, boolean arg4);

    @OriginalMember(owner = "client!xa", name = "B", descriptor = "()I")
    public final native int method305();

    @OriginalMember(owner = "client!xa", name = "oa", descriptor = "(Lw;)V")
    private final native void method2554(class459 arg0);

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;Lg;Lfc;IIII)V")
    public class395(class459 arg0, class97 arg1, class438 arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5985 = arg0;
        this.field5987 = arg1;
        this.field5986 = arg2.field6790;
        this.field5988 = arg2.field6788;
        int var8 = arg2.field6790 == null ? 0 : arg2.field6790.length;
        int var9 = arg2.field6788 == null ? 0 : arg2.field6788.length;
        int var10 = 0;
        int[] var11 = new int[var8 * 3 + var9];
        for (int var12 = 0; var12 < var8; var12++) {
            var11[var10++] = this.field5986[var12].field4607;
            var11[var10++] = this.field5986[var12].field4627;
            var11[var10++] = this.field5986[var12].field4623;
        }
        for (int var13 = 0; var13 < var9; var13++) {
            var11[var10++] = this.field5988[var13].field1439;
        }
        int var14 = arg2.field6760 == null ? 0 : arg2.field6760.length;
        int[] var15 = new int[var14 * 8];
        int var16 = 0;
        for (int var17 = 0; var17 < var14; var17++) {
            class168 var20 = arg2.field6760[var17];
            class371 var21 = class389.method2493(true, var20.field2450);
            var15[var16++] = var20.field2447;
            var15[var16++] = var21.field5695;
            var15[var16++] = var21.field5701;
            var15[var16++] = var21.field5696;
            var15[var16++] = var21.field5698;
            var15[var16++] = var21.field5694;
            var15[var16++] = var21.field5697 ? -1 : 0;
        }
        for (int var18 = 0; var18 < var14; var18++) {
            class168 var19 = arg2.field6760[var18];
            var15[var16++] = var19.field2456;
        }
        this.method2551(this.field5985, this.field5987, arg2.field6765, arg2.field6794, arg2.field6771, arg2.field6777, arg2.field6772, arg2.field6792, arg2.field6810, arg2.field6783, arg2.field6759, arg2.field6808, arg2.field6787, arg2.field6809, arg2.field6773, arg2.field6798, arg2.field6789, arg2.field6802, arg2.field6784, arg2.field6781, arg2.field6776, arg2.field6778, arg2.field6786, arg2.field6775, arg2.field6795, arg2.field6801, arg2.field6796, arg2.field6782, arg2.field6806, arg2.field6768, arg2.field6764, arg2.field6767, arg2.field6770, arg2.field6785, arg2.field6779, var11, var8, var9, arg3, arg4, arg5, arg6, var15);
    }

    @OriginalMember(owner = "client!xa", name = "l", descriptor = "()I")
    public final native int method318();

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class431.method2721(this, false);
        }
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lw;)V")
    public class395(class459 arg0) {
        this.field5985 = arg0;
        this.field5987 = null;
        this.method2554(arg0);
    }

    @OriginalMember(owner = "client!xa", name = "S", descriptor = "()I")
    public final native int method310();

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(I)V")
    public final native void method278(int arg0);

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final native void method293(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

    @OriginalMember(owner = "client!xa", name = "pa", descriptor = "()I")
    public final native int method287();
}
