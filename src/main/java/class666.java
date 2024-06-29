import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class666 extends class270 {

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "Z")
    public boolean field9465;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "[Lcc;")
    public class666[] field9464;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "Let;")
    public static class542 field9469 = new class542();

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field9463;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "I")
    public static int field9467;

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
    public static int field9468;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "I")
    public static int field9470;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field9472;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public int field9474;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field9476;

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "I")
    public static int field9478;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "Lkm;")
    public class321 field9466;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "Lki;")
    public class648 field9471;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Loa;ZII)Lta;")
    public static final class195 method3735(class635 arg0, boolean arg1, int arg2, int arg3) {
        field9470++;
        if (arg3 != -30596) {
            method3738(true);
        }
        class145 var4 = class65.method429(arg2, arg0, arg1, (byte) 65);
        return var4 == null ? null : var4.field1629;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)[[I")
    public int[][] method1251(int arg0, byte arg1) {
        field9476++;
        if (arg1 != 98) {
            method3735(null, true, 127, -63);
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)[I")
    public int[] method122(int arg0, int arg1) {
        field9472++;
        if (arg0 > -21) {
            this.method2648(87);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public void method118(int arg0) {
        if (arg0 != -9) {
            this.method1251(-60, (byte) -94);
        }
        field9473++;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3736(int arg0, int arg1, int arg2, int arg3) {
        if (class601.method3362(arg0, arg1, arg2)) {
            int var4 = arg1 << class8.field70;
            int var5 = arg2 << class8.field70;
            return class436.method2407(var4 + 1, class628.field8912[arg0].method253(arg1, arg2) + arg3, var5 + 1) && class436.method2407(class463.field6445 + var4 - 1, class628.field8912[arg0].method253(arg1 + 1, arg2) + arg3, var5 + 1) && class436.method2407(class463.field6445 + var4 - 1, class628.field8912[arg0].method253(arg1 + 1, arg2 + 1) + arg3, class463.field6445 + var5 - 1) && class436.method2407(var4 + 1, class628.field8912[arg0].method253(arg1, arg2 + 1) + arg3, class463.field6445 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)[[I")
    public final int[][] method3737(int arg0, int arg1, int arg2) {
        field9477++;
        if (arg2 != 3) {
            this.field9464 = null;
        }
        if (this.field9464[arg1].field9465) {
            int[] var4 = this.field9464[arg1].method122(-86, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field9464[arg1].method1251(arg0, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
    public int method2083(int arg0) {
        if (arg0 == 1) {
            field9463++;
            return -1;
        } else {
            return -15;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    public static void method3738(boolean arg0) {
        if (arg0) {
            field9469 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)[I")
    public final int[] method3739(int arg0, int arg1, int arg2) {
        if (arg1 >= -119) {
            method3736(52, 48, 5, 23);
        }
        field9478++;
        return this.field9464[arg0].field9465 ? this.field9464[arg0].method122(-92, arg2) : this.field9464[arg0].method1251(arg2, (byte) 98)[0];
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(III)V")
    public void method2649(int arg0, int arg1, int arg2) {
        field9467++;
        int var4 = this.field9474 == 255 ? arg1 : this.field9474;
        if (this.field9465) {
            this.field9466 = new class321(var4, arg1, arg2);
        } else {
            this.field9471 = new class648(var4, arg1, arg2);
        }
        if (arg0 <= 87) {
            this.method118(36);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(ILiaa;Z)V")
    public void method121(int arg0, class452 arg1, boolean arg2) {
        if (!arg2) {
            this.field9465 = true;
        }
        field9468++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public void method2081(int arg0) {
        field9462++;
        if (arg0 != 21456) {
            this.field9471 = null;
        }
        if (this.field9465) {
            this.field9466.method1814((byte) 37);
            this.field9466 = null;
        } else {
            this.field9471.method3645(arg0 ^ 0xFFFFAC58);
            this.field9471 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)I")
    public int method2648(int arg0) {
        field9475++;
        if (arg0 != -1) {
            this.field9464 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IZ)V")
    public class666(int arg0, boolean arg1) {
        this.field9465 = arg1;
        this.field9464 = new class666[arg0];
    }
}
