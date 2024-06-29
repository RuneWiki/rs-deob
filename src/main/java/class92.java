import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class92 extends class259 {

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Lab;")
    public class239 field1390;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "S")
    public static short field1387 = 320;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "[Z")
    public static boolean[] field1391 = new boolean[100];

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
    public static int[] field1392 = new int[4];

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "Lhl;")
    public static class139 field1384 = new class139(100);

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lji;")
    public static class256 field1389;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method692(boolean arg0) {
        field1391 = null;
        field1392 = null;
        field1384 = null;
        field1389 = null;
        if (arg0) {
            method692(false);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(JI)V")
    public static final void method693(long arg0, int arg1) {
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        if (arg1 != 0) {
            field1388 = -78;
        }
        field1386++;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lab;)V")
    public class92(class239 arg0) {
        this.field1390 = arg0;
    }
}
