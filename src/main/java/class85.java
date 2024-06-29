import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class85 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "Ljn;")
    public class503 field1291 = new class503();

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "I")
    public static int field1298 = 0;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "[[I")
    public static int[][] field1292 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!hu", name = "j", descriptor = "Ljn;")
    private class503 field1300;

    @OriginalMember(owner = "client!hu", name = "f", descriptor = "[[[I")
    public static int[][][] field1296;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Ljn;")
    public final class503 method628(int arg0) {
        field1295++;
        class503 var2 = this.field1300;
        if (this.field1291 == var2) {
            this.field1300 = null;
            return null;
        } else {
            this.field1300 = var2.field6933;
            int var3 = -97 % ((1 - arg0) / 37);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)Ljn;")
    public final class503 method629(int arg0) {
        field1297++;
        class503 var2 = this.field1291.field6933;
        if (this.field1291 == var2) {
            this.field1300 = null;
            return null;
        } else {
            this.field1300 = var2.field6933;
            return arg0 == 2 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLjn;)V")
    public final void method630(boolean arg0, class503 arg1) {
        if (arg1.field6934 != null) {
            arg1.method2872((byte) -9);
        }
        if (!arg0) {
            method633(-18);
        }
        field1294++;
        arg1.field6934 = this.field1291.field6934;
        arg1.field6933 = this.field1291;
        arg1.field6934.field6933 = arg1;
        arg1.field6933.field6934 = arg1;
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I")
    public final int method631(int arg0) {
        field1299++;
        int var2 = 0;
        if (arg0 != 4) {
            field1296 = null;
        }
        class503 var3 = this.field1291.field6933;
        while (this.field1291 != var3) {
            var3 = var3.field6933;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V")
    public final void method632(int arg0) {
        if (arg0 != 2) {
            field1292 = null;
        }
        while (true) {
            class503 var2 = this.field1291.field6933;
            if (this.field1291 == var2) {
                field1293++;
                this.field1300 = null;
                return;
            }
            var2.method2872((byte) -9);
        }
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)V")
    public static void method633(int arg0) {
        field1292 = null;
        if (arg0 != 22284) {
            field1298 = -69;
        }
        field1296 = null;
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
    public class85() {
        this.field1291.field6933 = this.field1291;
        this.field1291.field6934 = this.field1291;
    }
}
