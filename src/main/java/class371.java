import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class371 {

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "Z")
    public static boolean field5443 = false;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "[[F")
    public static float[][] field5441 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
    public static int[] field5444 = new int[2];

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V", line = 4)
    public static void method2245(int arg0) {
        field5444 = null;
        field5441 = null;
        if (arg0 != 50) {
            method2245(11);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[B", line = 27)
    public static final synchronized byte[] method2246(int arg0, int arg1) {
        field5442++;
        if (arg0 == arg1 && class359.field5316 > 0) {
            byte[] var2 = class78.field1387[--class359.field5316];
            class78.field1387[class359.field5316] = null;
            return var2;
        } else if (arg1 == 5000 && class481.field7346 > 0) {
            byte[] var3 = class243.field3654[--class481.field7346];
            class243.field3654[class481.field7346] = null;
            return var3;
        } else if (arg1 == 30000 && class456.field6998 > 0) {
            byte[] var4 = class291.field4423[--class456.field6998];
            class291.field4423[class456.field6998] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
