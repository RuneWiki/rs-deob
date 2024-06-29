import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class412 {

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "Lvg;")
    private class49 field6329 = new class49(64);

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Lri;")
    private class97 field6319;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "Leu;")
    public static class444 field6320 = new class444(3, 2);

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Z")
    public static boolean field6327 = false;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "[[I")
    public static int[][] field6325 = new int[128][128];

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "Lri;")
    public static class97 field6326;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V", line = 9)
    public static final void method2622(int arg0) {
        field6330++;
        int var1 = class17.field282.method2095(class497.field7259, arg0 + 9407);
        if (var1 == 0) {
            class428.field6538 = null;
            class428.method2711(0, (byte) 67);
        } else if (var1 == 1) {
            class240.method1728(true, (byte) 0);
            class428.method2711(512, (byte) 67);
            if (class690.field9676 != null) {
                class365.method2421(-115);
            }
        } else {
            class240.method1728(true, (byte) (class607.field8632 - 4 & 0xFF));
            class428.method2711(2, (byte) 67);
        }
        class257.field4080 = class423.field6439;
        if (arg0 != 1) {
            method2623(113);
        }
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V", line = 48)
    public static void method2623(int arg0) {
        field6326 = null;
        if (arg0 == 255) {
            field6325 = null;
            field6320 = null;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZI)Lrt;", line = 66)
    public final class209 method2624(boolean arg0, int arg1) {
        field6321++;
        class49 var3 = this.field6329;
        class209 var4;
        synchronized (this.field6329) {
            var4 = (class209) this.field6329.method560(!arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            field6327 = true;
        }
        class97 var5 = this.field6319;
        byte[] var6;
        synchronized (this.field6319) {
            var6 = this.field6319.method926(31, -125, arg1);
        }
        class209 var7 = new class209();
        if (var6 != null) {
            var7.method1593((byte) -119, new class6(var6));
        }
        class49 var8 = this.field6329;
        synchronized (this.field6329) {
            this.field6329.method559(var7, (long) arg1, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V", line = 106)
    public final void method2625(boolean arg0) {
        class49 var2 = this.field6329;
        synchronized (this.field6329) {
            this.field6329.method563(0);
            if (!arg0) {
                method2628(-114);
            }
        }
        field6328++;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 119)
    public final void method2626(byte arg0) {
        field6323++;
        class49 var2 = this.field6329;
        synchronized (this.field6329) {
            this.field6329.method569(0);
        }
        if (arg0 != 74) {
            method2622(-59);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V", line = 132)
    public final void method2627(int arg0, int arg1) {
        class49 var3 = this.field6329;
        synchronized (this.field6329) {
            this.field6329.method573((byte) 119, arg1);
        }
        field6324++;
        if (arg0 != 128) {
            this.method2626((byte) -5);
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)Z", line = 145)
    public static final boolean method2628(int arg0) {
        field6322++;
        if (arg0 != 6246) {
            method2628(29);
        }
        return class191.field3165;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lei;ILri;)V", line = 161)
    public class412(class162 arg0, int arg1, class97 arg2) {
        this.field6319 = arg2;
        this.field6319.method949(31, 0);
    }
}
