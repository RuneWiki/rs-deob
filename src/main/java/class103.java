import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class103 {

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field2022 = 0;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static volatile int field2020 = 0;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Ld;")
    public static class29 field2017 = new class29(8);

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field2023 = 0;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "Lsd;")
    public static class166 field2024 = class135.method935("<col=c0ff00>", 0);

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "Lsd;")
    private static class166 field2025 = class135.method935("Loaded fonts", 0);

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Lsd;")
    public static class166 field2026 = field2025;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Laa;")
    public static class2 field2018;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
    public static void method774(byte arg0) {
        field2017 = null;
        field2025 = null;
        field2026 = null;
        field2024 = null;
        if (arg0 == -105) {
            field2018 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)Ls;")
    public static final class162 method775(int arg0) {
        int var1 = -47 / ((35 - arg0) / 60);
        field2019++;
        try {
            return (class162) Class.forName("sf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class177();
        }
    }
}
