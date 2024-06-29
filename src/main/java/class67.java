import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class67 extends class120 {

    @OriginalMember(owner = "client!al", name = "R", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!al", name = "U", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!al", name = "M", descriptor = "Z")
    public boolean field1360;

    @OriginalMember(owner = "client!al", name = "V", descriptor = "F")
    public float field1369;

    @OriginalMember(owner = "client!al", name = "Q", descriptor = "F")
    public float field1364;

    @OriginalMember(owner = "client!al", name = "T", descriptor = "[Lsd;")
    public static class63[] field1367 = new class63[4];

    @OriginalMember(owner = "client!al", name = "Y", descriptor = "[[B")
    public static byte[][] field1372 = new byte[250][];

    @OriginalMember(owner = "client!al", name = "P", descriptor = "Los;")
    public static class309 field1363 = new class309("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!al", name = "N", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!al", name = "O", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!al", name = "S", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!al", name = "W", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!al", name = "X", descriptor = "Lgh;")
    public static class388 field1371;

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lda;IIIZ[I)V")
    public class67(class44 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field1365 = arg2;
        this.field1368 = arg3;
        if (~super.field5578 == -34038) {
            this.field1360 = false;
            this.field1369 = (float) arg2;
            this.field1364 = (float) arg3;
        } else {
            this.field1369 = this.field1364 = 1.0F;
            this.field1360 = true;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lgh;I)Ljava/lang/String;")
    public static final String method587(class388 arg0, int arg1) {
        int var2 = 68 / ((42 - arg1) / 62);
        ++field1361;
        if (~client.method1371(arg0).method881(20740) == -1) {
            return null;
        } else if (arg0.field5807 != null && arg0.field5807.trim().length() != 0) {
            return arg0.field5807;
        } else {
            return class321.field4902 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lda;IIIIZ[BI)V")
    public class67(class44 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (~super.field5578 != -34038) {
            this.field1360 = true;
            this.field1369 = this.field1364 = 1.0F;
        } else {
            this.field1364 = (float) arg4;
            this.field1360 = false;
            this.field1369 = (float) arg3;
        }
        this.field1368 = arg4;
        this.field1365 = arg3;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lda;IIIII[BI)V")
    public class67(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field1365 = arg2;
        this.field1368 = arg3;
        this.method969(arg2, 0, true, 0, 2, arg7, arg3, arg6, 0, 0);
        this.field1369 = (float) arg2 / (float) arg4;
        this.field1364 = (float) arg3 / (float) arg5;
        this.field1360 = false;
        this.method967(8276, false, false);
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(B)V")
    public static void method588(byte arg0) {
        field1371 = null;
        if (arg0 == 17) {
            field1372 = null;
            field1367 = null;
            field1363 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lda;IIIIIIZ)V")
    public class67(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field1365 = arg3;
        this.field1364 = (float) arg4 / (float) arg6;
        this.field1369 = (float) arg3 / (float) arg5;
        this.field1360 = false;
        this.field1368 = arg4;
        this.method967(8276, false, false);
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)V")
    public static final void method589(int arg0) {
        for (class53 var1 = (class53) class63.field1296.method533((byte) -85); var1 != null; var1 = (class53) class63.field1296.method536(-116)) {
            var1.method500();
        }
        ++field1362;
        if (arg0 != 1) {
            method589(-120);
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lda;IIIIIZ)V")
    public class67(class44 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field5578 == -34038) {
            this.field1369 = (float) arg4;
            this.field1360 = false;
            this.field1364 = (float) arg5;
        } else {
            this.field1369 = this.field1364 = 1.0F;
            this.field1360 = true;
        }
        this.field1365 = arg4;
        this.field1368 = arg5;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lda;IIII[I)V")
    public class67(class44 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field1368 = arg2;
        this.field1365 = arg1;
        this.method970(arg2, arg5, 0, 0, false, 0, 0, arg1, true);
        this.field1360 = false;
        this.field1369 = (float) arg1 / (float) arg3;
        this.field1364 = (float) arg2 / (float) arg4;
        this.method967(8276, false, false);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
    public static final void method590(int arg0, byte arg1, int arg2) {
        ++field1370;
        if (arg1 != 78) {
            method588((byte) 65);
        }
        class18 var3 = class140.method1047(1, arg2, false);
        var3.method122(true);
        var3.field283 = arg0;
    }
}
