import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class56 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lbv;")
    public class282 field752;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Z")
    public static boolean field754 = false;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lcm;")
    public static class449 field757;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lfd;")
    public static class313 field755;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[Lsm;")
    public static class69[] field758;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z")
    public abstract boolean method377(byte arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
    public static final void method378() {
        if (class492.field7181 != null) {
            for (int var0 = 0; var0 < class492.field7181.length; var0++) {
                for (int var1 = 0; var1 < class492.field7186; var1++) {
                    for (int var2 = 0; var2 < class285.field4248; var2++) {
                        if (class492.field7181[var0][var1][var2] != null) {
                            class492.field7181[var0][var1][var2].method2531(-126);
                        }
                        class492.field7181[var0][var1][var2] = null;
                    }
                }
            }
        }
        class492.field7181 = null;
        class204.field2871 = null;
        if (class483.field7028 != null) {
            for (int var3 = 0; var3 < class483.field7028.length; var3++) {
                for (int var4 = 0; var4 < class492.field7186; var4++) {
                    for (int var5 = 0; var5 < class285.field4248; var5++) {
                        if (class483.field7028[var3][var4][var5] != null) {
                            class483.field7028[var3][var4][var5].method2531(38);
                        }
                        class483.field7028[var3][var4][var5] = null;
                    }
                }
            }
        }
        class483.field7028 = null;
        class187.field2632 = null;
        class380.field5802 = null;
        class455.field6683 = null;
        class399.field6089 = 0;
        if (class313.field4787 != null) {
            for (int var6 = 0; var6 < class399.field6089; var6++) {
                class313.field4787[var6] = null;
            }
        }
        if (class232.field3295 != null) {
            for (int var7 = 0; var7 < class494.field7230; var7++) {
                class232.field3295[var7] = null;
            }
            class494.field7230 = 0;
        }
        if (class515.field7632 != null) {
            for (int var8 = 0; var8 < class309.field4630; var8++) {
                class515.field7632[var8] = null;
            }
            for (int var9 = 0; var9 < class222.field3107; var9++) {
                for (int var10 = 0; var10 < class492.field7186; var10++) {
                    for (int var11 = 0; var11 < class285.field4248; var11++) {
                        class467.field6805[var9][var10][var11] = 0L;
                    }
                }
            }
            class309.field4630 = 0;
        }
        class470.field6873 = null;
        class140.method935(109);
        class404.field6112.method2362((byte) 108);
        class482.field7024 = null;
        class202.field2843 = null;
        class518.field7684 = null;
        class307.field4503 = null;
        class164.field2397 = null;
        class351.field5447 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILkv;)V")
    public abstract void method379(int arg0, int arg1, class14 arg2);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
    public abstract void method380(boolean arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lbv;)V")
    public class56(class282 arg0) {
        this.field752 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public abstract void method381(int arg0);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    public abstract void method382(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(ZI)V")
    public abstract void method383(boolean arg0, int arg1);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
    public static void method384(int arg0) {
        if (arg0 >= 22) {
            field755 = null;
            field757 = null;
            field758 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/awt/Component;Lhu;III)Lfe;")
    public static final class235 method385(Component arg0, class469 arg1, int arg2, int arg3, int arg4) {
        field753++;
        if (class462.field6769 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class235 var5 = (class235) Class.forName("un").getDeclaredConstructor().newInstance();
                var5.field3354 = arg3;
                var5.field3339 = new int[(class40.field620 ? 2 : 1) * 256];
                var5.method928(arg0);
                var5.field3351 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field3351 > 16384) {
                    var5.field3351 = 16384;
                }
                var5.method927(var5.field3351);
                if (class138.field2021 > 0 && class62.field885 == null) {
                    class62.field885 = new class460();
                    class62.field885.field6749 = arg1;
                    arg1.method2792(class138.field2021, class62.field885, -10265);
                }
                if (class62.field885 != null) {
                    if (class62.field885.field6752[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class62.field885.field6752[arg4] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class139 var6 = new class139(arg1, arg4);
                    var6.field3339 = new int[(class40.field620 ? 2 : 1) * 256];
                    var6.field3354 = arg3;
                    var6.method928(arg0);
                    var6.field3351 = arg2;
                    var6.method927(var6.field3351);
                    if (class138.field2021 > 0 && class62.field885 == null) {
                        class62.field885 = new class460();
                        class62.field885.field6749 = arg1;
                        arg1.method2792(class138.field2021, class62.field885, -10265);
                    }
                    if (class62.field885 != null) {
                        if (class62.field885.field6752[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class62.field885.field6752[arg4] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class235();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    static {
        new class375("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field757 = new class449(41, 3);
    }
}
