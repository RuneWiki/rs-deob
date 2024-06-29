import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class274 {

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    public int field4358 = 0;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "I")
    public int field4362 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lof;")
    private class328 field4356 = new class328(64);

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "Lcb;")
    private class118 field4365 = null;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "Lmn;")
    private class162 field4357;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lmn;")
    private class162 field4361;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field4352 = 0;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[Lab;")
    public static class444[] field4354 = new class444[16];

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lte;")
    public static class187 field4353;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B[IJLcg;)Ljava/lang/String;")
    public final String method1845(byte arg0, int[] arg1, long arg2, class10 arg3) {
        if (arg0 >= -70) {
            this.method1845((byte) -80, null, 44L, null);
        }
        field4363++;
        if (this.field4365 != null) {
            String var6 = this.field4365.method751((byte) -112, arg2, arg3, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V")
    public static void method1846(boolean arg0) {
        if (!arg0) {
            field4353 = null;
            field4354 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public static final void method1847(int arg0, int arg1) {
        class409 var2 = class217.field3699[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class409 var4 = class217.field3699[var3][arg0][arg1] = class217.field3699[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field6182--;
                for (class192 var5 = var4.field6175; var5 != null; var5 = var5.field2841) {
                    class423 var6 = var5.field2845;
                    if (var6.field6423 == arg0 && var6.field6424 == arg1) {
                        var6.field6419--;
                    }
                }
            }
        }
        if (class217.field3699[0][arg0][arg1] == null) {
            class217.field3699[0][arg0][arg1] = new class409(0, arg0, arg1);
            class217.field3699[0][arg0][arg1].field6174 = 1;
        }
        class217.field3699[0][arg0][arg1].field6195 = var2;
        class217.field3699[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public static final void method1848(int arg0) {
        field4364++;
        if (class247.field4024) {
            return;
        }
        if (class141.field1911.field6082) {
            class388.field5918 = ((int) class388.field5918 - 65 & 0xFFFFFF80);
        } else {
            class376.field5767 += (-class376.field5767 - 24.0F) / 2.0F;
        }
        class528.field7774 = true;
        class247.field4024 = true;
        if (arg0 != -65) {
            method1848(28);
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZI)Lac;")
    public final class504 method1849(boolean arg0, int arg1) {
        field4355++;
        class504 var3 = (class504) this.field4356.method2191((byte) -73, (long) arg1);
        if (!arg0) {
            method1850(47);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field4361.method1004(1, false, arg1);
        } else {
            var4 = this.field4357.method1004(1, false, arg1 & 0x7FFF);
        }
        class504 var5 = new class504();
        var5.field7545 = this;
        if (var4 != null) {
            var5.method3060(new class208(var4), (byte) -120);
        }
        if (arg1 >= 32768) {
            var5.method3062((byte) 126);
        }
        this.field4356.method2188(-122, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)[Lcg;")
    public static final class10[] method1850(int arg0) {
        field4360++;
        if (arg0 != 64) {
            method1848(-36);
        }
        return new class10[] { class317.field4938, class462.field7106, class86.field1252, class260.field4196, class434.field6544, class249.field4038, class223.field3756, class93.field1354, class477.field7307, class218.field3707, class312.field4905, class83.field1219, class123.field1668, class81.field1199 };
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(ILmn;Lmn;Lcb;)V")
    public class274(int arg0, class162 arg1, class162 arg2, class118 arg3) {
        this.field4357 = arg2;
        this.field4365 = arg3;
        this.field4361 = arg1;
        if (this.field4361 != null) {
            this.field4358 = this.field4361.method1008(1, (byte) -21);
        }
        if (this.field4357 != null) {
            this.field4362 = this.field4357.method1008(1, (byte) -21);
        }
    }
}
