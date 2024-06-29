import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class class372 {

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public int field5359 = 0;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "[Ljava/lang/Object;")
    public Object[] field5357 = new Object[5000];

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "[F")
    public float[] field5362 = new float[5000];

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "[B")
    public byte[] field5367 = new byte[5000];

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
    public volatile int field5368 = 0;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public volatile int field5363 = 0;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field5365 = 0;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
    public static int field5361;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field5366;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lo;ZFII)V")
    public abstract void method778(class24 arg0, boolean arg1, float arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II[Ltf;)V")
    public static final void method2275(int arg0, int arg1, class198[] arg2) {
        if (arg0 != -11958) {
            method2279(4, 114, -107, true, 94);
        }
        field5366++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class198 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2941 == 0) {
                    if (var4.field3013 != null) {
                        method2275(-11958, arg1, var4.field3013);
                    }
                    class541 var5 = (class541) class220.field3370.method2284(true, (long) var4.field3016);
                    if (var5 != null) {
                        class504.method2943(var5.field7955, (byte) -61, arg1);
                    }
                }
                if (arg1 == 0 && var4.field2950 != null) {
                    class361 var6 = new class361();
                    var6.field5256 = var4.field2950;
                    var6.field5252 = var4;
                    class281.method1805(var6);
                }
                if (arg1 == 1 && var4.field2942 != null) {
                    if (var4.field2969 >= 0) {
                        class198 var7 = class154.method1087(var4.field3016, 2);
                        if (var7 == null || var7.field3013 == null || var4.field2969 >= var7.field3013.length || var7.field3013[var4.field2969] != var4) {
                            continue;
                        }
                    }
                    class361 var8 = new class361();
                    var8.field5252 = var4;
                    var8.field5256 = var4.field2942;
                    class281.method1805(var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)V")
    public abstract void method777(byte arg0);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(BLmm;)V")
    public abstract void method775(byte arg0, class188 arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
    public abstract void method780(int arg0, int arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lmm;Z)V")
    public abstract void method772(class188 arg0, boolean arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILrj;)Z")
    public static final boolean method2276(int arg0, class430 arg1) {
        int var2 = 84 % ((-arg0 - 9) / 63);
        field5360++;
        return class30.field408 == arg1 || class116.field1798 == arg1 || class2.field3 == arg1 || class319.field4739 == arg1;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
    public abstract void method769(int arg0);

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(II)V")
    public abstract void method770(int arg0, int arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Ltf;I)Ltf;")
    public static final class198 method2277(class198 arg0, int arg1) {
        field5364++;
        class198 var2 = client.method1375(arg0);
        if (arg1 != 22988) {
            field5358 = -58;
        }
        if (var2 == null) {
            var2 = arg0.field2956;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
    public static final void method2278(int arg0, int arg1) {
        class188 var2 = class461.field6675[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class188 var4 = class461.field6675[var3][arg0][arg1] = class461.field6675[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2769--;
                for (class317 var5 = var4.field2773; var5 != null; var5 = var5.field4709) {
                    class478 var6 = var5.field4711;
                    if (var6.field6971 == arg0 && var6.field6962 == arg1) {
                        var6.field6956--;
                    }
                }
            }
        }
        if (class461.field6675[0][arg0][arg1] == null) {
            class461.field6675[0][arg0][arg1] = new class188(0, arg0, arg1);
            class461.field6675[0][arg0][arg1].field2763 = 1;
        }
        class461.field6675[0][arg0][arg1].field2772 = var2;
        class461.field6675[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILmm;)V")
    public abstract void method776(int arg0, class188 arg1);

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIZI)V")
    public static final void method2279(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 != 0) {
            field5358 = -124;
        }
        field5361++;
        if (class175.method1224(arg0, 7607)) {
            class297.method1909((byte) -74, class283.field4217[arg0], arg1, -1, arg3, arg4);
        }
    }
}
