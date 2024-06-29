import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public abstract class class464 {

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field6927 = -1;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "Lrl;")
    public static class672 field6925 = new class672(28, 3);

    @OriginalMember(owner = "client!is", name = "b", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "Lmq;")
    public static class470 field6931;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "Lsi;")
    public static class520 field6929;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)J")
    public abstract long method446(int arg0);

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V")
    public static void method2897(int arg0) {
        if (arg0 != 0) {
            method2898((byte) 112, null);
        }
        field6931 = null;
        field6925 = null;
        field6929 = null;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2898(byte arg0, String arg1) {
        field6928++;
        if (arg1 == null) {
            return;
        }
        if (!(class204.field3334 < 200 || class303.field4715) || class204.field3334 >= 200) {
            class307.method2122(4, class122.field1982.method1091(class135.field2206, 1), (byte) 109);
            String var2 = class122.field1983.method1091(class135.field2206, 1);
            if (var2 != null) {
                class307.method2122(4, var2, (byte) 110);
            }
            return;
        }
        String var3 = class321.method2179(-2081246228, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class204.field3334; var4++) {
            String var10 = class321.method2179(-2081246228, class527.field7700[var4]);
            if (var10 != null && var10.equals(var3)) {
                class307.method2122(4, arg1 + class122.field2010.method1091(class135.field2206, 1), (byte) 121);
                return;
            }
            if (class20.field328[var4] != null) {
                String var11 = class321.method2179(-2081246228, class20.field328[var4]);
                if (var11 != null && var11.equals(var3)) {
                    class307.method2122(4, arg1 + class122.field2010.method1091(class135.field2206, 1), (byte) 117);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class51.field691; var5++) {
            String var8 = class321.method2179(-2081246228, class478.field7077[var5]);
            if (var8 != null && var8.equals(var3)) {
                class307.method2122(4, class122.field2015.method1091(class135.field2206, 1) + arg1 + class122.field2016.method1091(class135.field2206, 1), (byte) 103);
                return;
            }
            if (class333.field5455[var5] != null) {
                String var9 = class321.method2179(-2081246228, class333.field5455[var5]);
                if (var9 != null && var9.equals(var3)) {
                    class307.method2122(4, class122.field2015.method1091(class135.field2206, 1) + arg1 + class122.field2016.method1091(class135.field2206, 1), (byte) 105);
                    return;
                }
            }
        }
        if (class321.method2179(-2081246228, class567.field8141.field4792).equals(var3)) {
            class307.method2122(4, class122.field2013.method1091(class135.field2206, 1), (byte) 116);
            return;
        }
        class66.field852++;
        int var6 = 99 % ((arg0 - 49) / 51);
        class165 var7 = class271.method1917(class420.field6424, (byte) -102, class674.field9508);
        var7.field2776.method65(class516.method3125(118, arg1), -77);
        var7.field2776.method28(arg1, 0);
        class642.method3726(-684096285, var7);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZJ)I")
    public final int method2899(boolean arg0, long arg1) {
        if (!arg0) {
            return -76;
        }
        field6926++;
        long var4 = this.method446(-115);
        if (var4 > 0L) {
            class549.method3313(var4, 124);
        }
        return this.method444(arg1, 20359);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(JI)I")
    public abstract int method444(long arg0, int arg1);

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)J")
    public abstract long method445(int arg0);
}
