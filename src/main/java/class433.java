import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public abstract class class433 extends class263 {

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "Ljaa;")
    public class576 field5465;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5463;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
    public boolean field5461;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public final boolean method2374(int arg0) {
        field5459++;
        if (arg0 != -20450) {
            this.field5461 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
    public static void method2375(boolean arg0) {
        field5463 = null;
        if (!arg0) {
            field5463 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)I")
    public int method2376(int arg0) {
        int var2 = -108 % ((30 - arg0) / 62);
        field5466++;
        return 0;
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
    public final int method2377(int arg0) {
        field5460++;
        if (arg0 != -2698) {
            method2375(false);
        }
        return 1;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(Z)Z")
    public abstract boolean method2378(boolean arg0);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class95.field1240 = arg1;
        field5458++;
        if (arg6 != 16128) {
            return;
        }
        class504.field6285 = arg5;
        class189.field2244 = arg0;
        class380.field4876 = arg4;
        class142.field1728 = arg2;
        class130.field1572 = arg3;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLco;ILco;)V")
    public abstract void method2380(boolean arg0, class109 arg1, int arg2, class109 arg3);

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)Z")
    public final boolean method2381(int arg0) {
        if (arg0 != 1) {
            this.field5461 = false;
        }
        field5464++;
        return this.field5461;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V")
    public abstract void method2382(int arg0, byte arg1);

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "(I)Z")
    public abstract boolean method2383(int arg0);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public abstract void method2384(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(I)V")
    public abstract void method2385(int arg0);

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method2386(int arg0, int arg1) {
        field5462++;
        class245.field3161 = new int[arg0];
        if (arg1 <= 17) {
            method2379(-19, 27, -119, 62, 20, -6, 38);
        }
        class102.field1311 = new int[arg0];
        class228.field2948 = new int[arg0];
        class711.field9936 = new int[arg0];
        class478.field5956 = new int[arg0];
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(Ljaa;)V")
    public class433(class576 arg0) {
        this.field5465 = arg0;
    }
}
