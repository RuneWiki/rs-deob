import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class388 extends class755 {

    @OriginalMember(owner = "client!kda", name = "E", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!kda", name = "F", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!kda", name = "G", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!kda", name = "H", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!kda", name = "J", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!kda", name = "I", descriptor = "[B")
    private byte[] field5490;

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "()V", line = 4)
    public class388() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IBII)[B", line = 10)
    public final byte[] method2441(int arg0, byte arg1, int arg2, int arg3) {
        field5491++;
        if (arg1 != -56) {
            method2442(86L, null, 115);
        }
        this.field5490 = new byte[arg0 * arg3 * arg2 * 2];
        this.method2625(arg0, arg2, false, arg3);
        return this.field5490;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZBI)V", line = 27)
    public final void method131(boolean arg0, byte arg1, int arg2) {
        field5488++;
        if (arg0) {
            this.field5490 = null;
        }
        byte var4 = (byte) ((arg1 >> 1 & 0x7F) + 127);
        int var5 = arg2 * 2;
        int var6 = var5 + 1;
        this.field5490[var5] = var4;
        this.field5490[var6] = var4;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(JLha;I)V", line = 44)
    public static final void method2442(long arg0, class58 arg1, int arg2) {
        class70.field888 = class409.field5798;
        field5487++;
        class356.field5068 = 0;
        class140.field2022 = 0;
        class409.field5798 = 0;
        long var4 = class479.method2864((byte) -95);
        if (arg2 != -16448) {
            method2442(126L, null, -61);
        }
        for (class537 var6 = (class537) class98.field1184.method2301(-31182); var6 != null; var6 = (class537) class98.field1184.method2310(110)) {
            if (var6.method3108(arg1, arg0)) {
                class356.field5068++;
            }
        }
        if (class182.field2473 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class98.field1184.method2302((byte) 58) + ", running: " + class356.field5068);
            System.out.println("Emitters: " + class140.field2022 + " Particles: " + class409.field5798 + ". Time taken: " + (class479.method2864((byte) -55) - var4) + "ms");
        }
    }
}
