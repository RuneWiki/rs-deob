import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class78 {

    @OriginalMember(owner = "client!qc", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field24 = "Loading sprites - ";

    @OriginalMember(owner = "client!qc", name = "O", descriptor = "Ljava/lang/String;")
    public static String field22 = "Loaded world list data";

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "Z")
    public static boolean field28 = false;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "client!qc", name = "G", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!qc", name = "H", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!qc", name = "I", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!qc", name = "J", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!qc", name = "K", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
    public int field20;

    @OriginalMember(owner = "client!qc", name = "N", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!qc", name = "P", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qc", name = "S", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Ljava/lang/String;")
    public String field29;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)V", line = 5)
    public final void method6(int arg0) {
        if (arg0 != 255) {
            this.method14(118);
        }
        this.field1191 = this.field1191 & Long.MIN_VALUE | class154.method1172((byte) 106) + 500L;
        field19++;
        class162.field2545.method1616(1, this);
    }

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "(I)V", line = 20)
    public static void method7(int arg0) {
        field24 = null;
        if (arg0 < -84) {
            field22 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)J", line = 31)
    public final long method8(byte arg0) {
        if (arg0 != -74) {
            this.field29 = (String) null;
        }
        field26++;
        return Long.MAX_VALUE & this.field1191;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V", line = 54)
    public static final void method9(boolean arg0) {
        class195.field3099.method1837(-22);
        field16++;
        class191.field3048.method1837(10);
        class98.field1623.method1837(-125);
        if (!arg0) {
            method13();
        }
    }

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "(I)I", line = 68)
    public final int method10(int arg0) {
        int var2 = -112 / ((-arg0 - 2) / 45);
        field25++;
        return (int) (this.field3734 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(JI)V", line = 79)
    public static final void method11(long arg0, int arg1) {
        try {
            if (arg1 > -43) {
                method11(37L, -88);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var4) {
        }
        field27++;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)I", line = 102)
    public final int method12(byte arg0) {
        field17++;
        if (arg0 > -8) {
            this.field15 = 1;
        }
        return (int) this.field3734;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "()V", line = 113)
    public static final void method13() {
        GL var0 = class265.field4099;
        var0.glDisableClientState(32886);
        class265.method1892(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class265.method1908();
        for (int var1 = 0; var1 < class251.field3864[0].length; var1++) {
            class186 var2 = class251.field3864[0][var1];
            if (var2.field2979 >= 0 && class174.field2734.method1478(255, var2.field2979) == 4) {
                var0.glColor4fv(class95.method678(var2.field2966, (byte) 80), 0);
                float var3 = 201.5F - (var2.field2961 ? 1.0F : 0.5F);
                var2.method1399(class60.field946, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class265.method1893();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class265.method1897();
    }

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "(I)V", line = 146)
    public final void method14(int arg0) {
        this.field1191 |= Long.MIN_VALUE;
        field23++;
        if (arg0 != 24710) {
            this.method8((byte) -21);
        }
        if (this.method8((byte) -74) == 0L) {
            class60.field941.method1616(1, this);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(II)V", line = 170)
    public class4(int arg0, int arg1) {
        this.field3734 = (long) arg1 | (long) arg0 << 32;
    }
}
