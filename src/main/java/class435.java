import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class class435 extends class96 {

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public int field6377;

    @OriginalMember(owner = "client!or", name = "F", descriptor = "Z")
    public static boolean field6375 = false;

    @OriginalMember(owner = "client!or", name = "B", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!or", name = "C", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!or", name = "D", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!or", name = "E", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!or", name = "G", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!or", name = "c", descriptor = "(Z)V")
    public static final void method2566(boolean arg0) {
        class297.field4328 = -1;
        class398.field5866 = 0;
        if (!arg0) {
            method2569(-61, true, -53, -18);
        }
        class477.field6869 = 0;
        class468.field6755 = 1;
        field6372++;
        class122.field1596 = 0;
        class384.field5705 = -3;
        class450.field6555 = false;
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "([[[Lhg;I)V")
    public static final void method2567(class468[][][] arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        field6371++;
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class468[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class468 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6761 instanceof class113) {
                            ((class113) var6.field6761).method368(arg1 + 5895);
                        }
                        if (var6.field6772 instanceof class113) {
                            ((class113) var6.field6772).method368(5894);
                        }
                        if (var6.field6777 instanceof class113) {
                            ((class113) var6.field6777).method368(5894);
                        }
                        if (var6.field6778 instanceof class113) {
                            ((class113) var6.field6778).method368(arg1 ^ 0xFFFFE8F9);
                        }
                        if (var6.field6766 instanceof class113) {
                            ((class113) var6.field6766).method368(5894);
                        }
                        for (class323 var7 = var6.field6769; var7 != null; var7 = var7.field4727) {
                            class210 var8 = var7.field4726;
                            if (var8 instanceof class113) {
                                ((class113) var8).method368(5894);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(ZI)V")
    public static final void method2568(boolean arg0, int arg1) {
        field6376++;
        client.field2672++;
        class386.method2321(true, class121.field1582);
        class311 var2 = (class311) class213.field3010.method2316(4999);
        if (arg1 < 112) {
            method2567(null, 96);
        }
        while (var2 != null) {
            if (!var2.method542((byte) -58)) {
                var2 = (class311) class213.field3010.method2316(4999);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4526 == 0) {
                class32.method264(true, -16318928, arg0, var2);
            }
            var2 = (class311) class213.field3010.method2308((byte) 121);
        }
        if (class319.field4688 != null) {
            class170.method1068(-93, class319.field4688);
            class319.field4688 = null;
        }
    }

    @OriginalMember(owner = "client!or", name = "d", descriptor = "(Z)Z")
    public abstract boolean method1225(boolean arg0);

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IZII)V")
    public static final void method2569(int arg0, boolean arg1, int arg2, int arg3) {
        field6374++;
        if (arg0 == 0) {
            class410.field6016++;
            class386.method2321(true, class453.field6587);
        }
        if (arg0 == 1) {
            class386.method2321(true, class40.field616);
            class481.field6939++;
        }
        class79.field1108.method987(arg2 + class223.field3158, (byte) 6);
        class79.field1108.method961(arg3 + class455.field6637, 1608339368);
        class79.field1108.method945(-22, class489.field7484.method1877(-117, 82) ? 1 : 0);
        class2.field33 = arg2;
        class358.field5314 = arg1;
        class495.field7547 = arg3;
        class65.method459(-1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method1226(int arg0);

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(I)V")
    public class435(int arg0) {
        this.field6377 = arg0;
    }
}
