import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class238 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lhi;")
    public static class82 field4135 = class95.method664((byte) -50, "Connexion perdue)3");

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "Lhi;")
    public static class82 field4140 = class95.method664((byte) -67, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "[Lec;")
    public static class96[] field4141 = new class96[50];

    @OriginalMember(owner = "client!gh", name = "n", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!gh", name = "l", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!gh", name = "m", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4136;

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "[Lti;")
    public static class186[] field4142;

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "[[[Lrk;")
    public static class16[][][] field4139;

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V", line = 3)
    public class238() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1677(boolean arg0) {
        field4139 = (class16[][][]) null;
        field4140 = null;
        field4141 = null;
        field4142 = null;
        if (!arg0) {
            field4135 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IILum;I)[Lve;", line = 23)
    public static final class212[] method1678(int arg0, int arg1, class222 arg2, int arg3) {
        field4146++;
        if (client.method866(arg3, arg1, (byte) 49, arg2)) {
            if (arg0 != 3738) {
                field4141 = (class96[]) null;
            }
            return class98.method675(-54);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lrm;III)V", line = 37)
    public static final void method1679(class175 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class89.field1605) {
            class16 var4 = class15.field120[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field161 != null && var4.field161.field2150.method234()) {
                arg0.method192(var4.field161.field2150, 128, 0, 0, true);
            }
        }
        if (arg3 < class89.field1605) {
            class16 var5 = class15.field120[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field161 != null && var5.field161.field2150.method234()) {
                arg0.method192(var5.field161.field2150, 0, 0, 128, true);
            }
        }
        if (arg2 < class89.field1605 && arg3 < class38.field658) {
            class16 var6 = class15.field120[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field161 != null && var6.field161.field2150.method234()) {
                arg0.method192(var6.field161.field2150, 128, 0, 128, true);
            }
        }
        if (arg2 < class89.field1605 && arg3 > 0) {
            class16 var7 = class15.field120[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field161 != null && var7.field161.field2150.method234()) {
                arg0.method192(var7.field161.field2150, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V", line = 102)
    public static final void method1680(int arg0, byte arg1) {
        class175.field3038.method2177(arg0, 99);
        int var2 = 122 / ((arg1 - 16) / 59);
        field4143++;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(Z)V", line = 113)
    public static final void method1681(boolean arg0) {
        class104.field1840 = new class277();
        field4144++;
        if (!arg0) {
            field4142 = (class186[]) null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([BLbc;I)V", line = 144)
    public final void method1682(byte[] arg0, class153 arg1, int arg2) {
        field4138++;
        if (arg1.field2598[arg1.field2611] != 31 || arg1.field2598[arg1.field2611 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4136 == null) {
            this.field4136 = new Inflater(true);
        }
        try {
            this.field4136.setInput(arg1.field2598, arg1.field2611 + 10, arg1.field2598.length + -arg1.field2611 + arg2);
            this.field4136.inflate(arg0);
        } catch (Exception var5) {
            this.field4136.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4136.reset();
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(III)V", line = 177)
    private class238(int arg0, int arg1, int arg2) {
    }
}
