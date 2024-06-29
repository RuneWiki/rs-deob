import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class744 implements class715 {

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Llda;")
    private class484 field10391;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[Lmp;")
    private class758[] field10383;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field10389 = 1405;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10385 = 100;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10384;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10386;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field10388;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field10390;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field10392;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field10394;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lha;")
    private class58 field10393;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
    private boolean field10382;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)Z", line = 3)
    public final boolean method1192(long arg0, int arg1) {
        field10392++;
        if (arg1 != -3762) {
            this.field10382 = false;
        }
        return class652.method3700(-1) >= (arg0 + ((long) this.field10391.field6883));
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Lkw;", line = 18)
    public static final class249 method4139(boolean arg0) {
        if (arg0) {
            field10381++;
            return class37.field422 == 0 ? new class249() : class180.field2128[--class37.field422];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)I", line = 37)
    public final int method1196(byte arg0) {
        if (arg0 <= 26) {
            method4139(false);
        }
        field10384++;
        return this.field10391.field6888;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 51)
    public final void method1197(byte arg0) {
        if (class275.field3370 != this.field10393) {
            this.field10393 = class275.field3370;
            this.field10382 = true;
        }
        field10394++;
        this.field10393.method378(0);
        class758[] var2 = this.field10383;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class758 var4 = var2[var3];
            if (var4 != null) {
                var4.method11(23169);
            }
        }
        if (arg0 != -3) {
            this.field10391 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ZI)V", line = 83)
    public final void method1193(boolean arg0, int arg1) {
        boolean var3 = true;
        if (arg1 != 23552) {
            return;
        }
        field10388++;
        class758[] var4 = this.field10383;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class758 var6 = var4[var5];
            if (var6 != null) {
                var6.method12(var3 || this.field10382, 82);
            }
        }
        this.field10382 = false;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)I", line = 118)
    public final int method1186(int arg0) {
        field10386++;
        int var2 = 0;
        if (arg0 != 31867) {
            this.field10383 = null;
        }
        class758[] var3 = this.field10383;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class758 var5 = var3[var4];
            if (var5 == null || var5.method9((byte) 119)) {
                var2++;
            }
        }
        return var2 * 100 / this.field10383.length;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 144)
    public final void method1190(int arg0) {
        if (arg0 != 4046) {
            field10390 = -70;
        }
        field10387++;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Llda;Lmd;)V", line = 153)
    public class744(class484 arg0, class541 arg1) {
        this.field10391 = arg0;
        this.field10383 = new class758[this.field10391.field6879.length];
        for (int var3 = 0; var3 < this.field10383.length; var3++) {
            this.field10383[var3] = arg1.method3179(this.field10391.field6879[var3], (byte) 59);
        }
    }
}
