import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class227 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Liu;")
    public static class517 field3388 = new class517(94, 5);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "Lpp;")
    public static class464 field3389 = new class464(31, 8);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "Ln;")
    public static class472 field3390;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 3)
    public static void method1504(int arg0) {
        if (arg0 == -1445) {
            field3388 = null;
            field3390 = null;
            field3389 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 15)
    public static final void method1505() {
        if (class598.field8507 != null) {
            for (int var0 = 0; var0 < class598.field8507.length; var0++) {
                for (int var1 = 0; var1 < class362.field5145; var1++) {
                    for (int var2 = 0; var2 < class305.field4400; var2++) {
                        if (class598.field8507[var0][var1][var2] != null) {
                            class598.field8507[var0][var1][var2].method1233(9);
                        }
                        class598.field8507[var0][var1][var2] = null;
                    }
                }
            }
        }
        class598.field8507 = null;
        class587.field8363 = null;
        if (class245.field3546 != null) {
            for (int var3 = 0; var3 < class245.field3546.length; var3++) {
                for (int var4 = 0; var4 < class362.field5145; var4++) {
                    for (int var5 = 0; var5 < class305.field4400; var5++) {
                        if (class245.field3546[var3][var4][var5] != null) {
                            class245.field3546[var3][var4][var5].method1233(105);
                        }
                        class245.field3546[var3][var4][var5] = null;
                    }
                }
            }
        }
        class245.field3546 = null;
        class73.field1360 = null;
        class277.field4051 = null;
        class88.field1594 = null;
        class546.field7593 = 0;
        if (class350.field5012 != null) {
            for (int var6 = 0; var6 < class546.field7593; var6++) {
                class350.field5012[var6] = null;
            }
        }
        if (class393.field5892 != null) {
            for (int var7 = 0; var7 < class262.field3831; var7++) {
                class393.field5892[var7] = null;
            }
            class262.field3831 = 0;
        }
        if (class477.field6820 != null) {
            for (int var8 = 0; var8 < class73.field1363; var8++) {
                class477.field6820[var8] = null;
            }
            for (int var9 = 0; var9 < class146.field2246; var9++) {
                for (int var10 = 0; var10 < class362.field5145; var10++) {
                    for (int var11 = 0; var11 < class305.field4400; var11++) {
                        class90.field1621[var9][var10][var11] = 0L;
                    }
                }
            }
            class73.field1363 = 0;
        }
        class310.field4552 = null;
        class260.method1651(true);
        class578.field8241.method951(-8790);
        class103.field1746 = null;
        class99.field1716 = null;
        class470.field6764 = null;
        class181.field2624 = null;
        class142.field2218 = null;
        class103.field1747 = null;
    }
}
