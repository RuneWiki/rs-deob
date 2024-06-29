import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class455 {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public int field6627 = 43594;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public int field6631 = 443;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Z")
    public boolean field6634 = false;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Z")
    public static boolean field6636 = false;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Lhba;")
    public static class404 field6635 = new class404();

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "[F")
    public static float[] field6638 = new float[4];

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public int field6633;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Lha;")
    public static class116 field6637;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Ljava/lang/String;")
    public String field6630;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)I", line = 5)
    public final int method2731(int arg0) {
        if (arg0 != -3386) {
            method2733((byte) 56);
        }
        field6632++;
        return this.field6634 ? this.field6631 : this.field6627;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILuf;)[Lql;", line = 20)
    public static final class155[] method2732(int arg0, class353 arg1) {
        field6628++;
        if (!arg1.method2178((byte) -115)) {
            return new class155[0];
        }
        class286 var2 = arg1.method2160((byte) 19);
        while (var2.field4208 == 0) {
            class428.method2624(1, 10L);
        }
        if (~var2.field4208 == arg0) {
            return new class155[0];
        }
        int[] var3 = (int[]) var2.field4213;
        class155[] var4 = new class155[var3.length >> 2];
        for (int var5 = 0; var5 < var4.length; var5++) {
            class155 var6 = new class155();
            var4[var5] = var6;
            var6.field1981 = var3[var5 << 2];
            var6.field1982 = var3[(var5 << 2) + 1];
            var6.field1985 = var3[(var5 << 2) + 2];
            var6.field1987 = var3[(var5 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 66)
    public static void method2733(byte arg0) {
        field6638 = null;
        field6635 = null;
        field6637 = null;
        if (arg0 != -50) {
            method2734(false);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V", line = 80)
    public static final void method2734(boolean arg0) {
        field6626++;
        if (class311.field4569 != null) {
            if (class311.field4569.field4208 == 1) {
                class311.field4569 = null;
                return;
            }
            if (class311.field4569.field4208 == 2) {
                class326.method2041(class240.field3509, -8346, 2, class124.field1641);
                class311.field4569 = null;
                return;
            }
        }
        if (!arg0) {
            field6638 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lkn;B)Z", line = 112)
    public final boolean method2735(class455 arg0, byte arg1) {
        field6629++;
        if (arg1 != 101) {
            this.field6633 = -122;
        }
        if (arg0 == null) {
            return false;
        } else {
            return this.field6633 == arg0.field6633 && this.field6630.equals(arg0.field6630);
        }
    }
}
