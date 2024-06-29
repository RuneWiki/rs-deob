import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class173 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[Lcg;")
    public static class118[] field3003 = new class118[4];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lda;")
    public static class275 field2998 = class255.method1672(124, "null");

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field3006 = 127;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lda;")
    public static class275 field3007 = class255.method1672(96, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[[Lfd;")
    public static class229[][] field3005;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLij;)Lsk;")
    public static final class181 method1175(byte arg0, class85 arg1) {
        if (arg0 != 117) {
            field2998 = null;
        }
        field3004++;
        return new class181(arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method570(255), arg1.method570(arg0 + 138), arg1.method570(255), arg1.method570(255), arg1.method598(84), arg1.method564((byte) 101));
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
    public static final void method1176() {
        if (class185.field3173 != null) {
            for (int var0 = 0; var0 < class185.field3173.length; var0++) {
                for (int var1 = 0; var1 < class247.field4359; var1++) {
                    for (int var2 = 0; var2 < class172.field2997; var2++) {
                        class185.field3173[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class235.field4094 != null) {
            for (int var3 = 0; var3 < class235.field4094.length; var3++) {
                for (int var4 = 0; var4 < class247.field4359; var4++) {
                    for (int var5 = 0; var5 < class172.field2997; var5++) {
                        class235.field4094[var3][var4][var5] = null;
                    }
                }
            }
        }
        class107.field1859 = 0;
        if (class158.field2776 != null) {
            for (int var6 = 0; var6 < class107.field1859; var6++) {
                class158.field2776[var6] = null;
            }
        }
        if (class229.field3958 != null) {
            for (int var7 = 0; var7 < class235.field4104; var7++) {
                class229.field3958[var7] = null;
            }
            class235.field4104 = 0;
        }
        if (class5.field70 != null) {
            for (int var8 = 0; var8 < class5.field70.length; var8++) {
                class5.field70[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method1177(boolean arg0) {
        if (arg0) {
            field3007 = null;
            field3003 = null;
            field2998 = null;
            field3005 = null;
        }
    }
}
