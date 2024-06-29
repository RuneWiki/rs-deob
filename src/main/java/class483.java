import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class483 extends class74 {

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "Lgk;")
    public static class331 field7100 = new class331("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "Lsl;")
    public static class318 field7101 = new class318(64, 8);

    @OriginalMember(owner = "client!bw", name = "v", descriptor = "Lbg;")
    public static class324 field7111 = new class324(26, -1);

    @OriginalMember(owner = "client!bw", name = "w", descriptor = "Lgk;")
    public static class331 field7112 = new class331("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "C")
    public char field7109;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
    public static int field7098;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "I")
    public static int field7104;

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
    public static int field7106;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "I")
    public int field7107;

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "I")
    public int field7110;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "J")
    public long field7103;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "Lbw;")
    public class483 field7105;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "Z")
    public boolean field7108;

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)C", line = 3)
    public final char method704(int arg0) {
        field7106++;
        if (arg0 != 2) {
            this.method697(56);
        }
        return this.field7109;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)Z", line = 14)
    public final boolean method696(boolean arg0) {
        field7099++;
        return arg0 ? false : this.field7108;
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)I", line = 27)
    public final int method701(byte arg0) {
        if (arg0 < 72) {
            return -75;
        } else {
            field7098++;
            return this.field7107;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)J", line = 43)
    public final long method697(int arg0) {
        field7104++;
        if (arg0 != -5423) {
            this.field7108 = false;
        }
        return this.field7103;
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)V", line = 57)
    public static void method2910(int arg0) {
        field7101 = null;
        field7112 = null;
        field7111 = null;
        field7100 = null;
        if (arg0 < 96) {
            method2910(44);
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)I", line = 73)
    public final int method700(int arg0) {
        field7102++;
        int var2 = -27 % ((arg0 + 2) / 47);
        return this.field7110;
    }
}
