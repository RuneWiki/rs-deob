import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public abstract class class47 extends class352 {

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
    public boolean field682 = false;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "Z")
    public boolean field679 = false;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "I")
    public int field681;

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "Lo;")
    public static class332 field676 = new class332(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public static int field685 = -1;

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "I")
    public static int field684 = -1;

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V", line = 3)
    public static void method346(byte arg0) {
        if (arg0 == -8) {
            field676 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBII)V", line = 17)
    public static final void method347(int arg0, byte arg1, int arg2, int arg3) {
        if (arg0 == 1003) {
            class477.method2799(class381.field5650, arg2, arg3);
        } else if (arg0 == 1011) {
            class477.method2799(class427.field6101, arg2, arg3);
        } else if (arg0 == 1007) {
            class477.method2799(class370.field5577, arg2, arg3);
        } else if (arg0 == 1010) {
            class477.method2799(class466.field6563, arg2, arg3);
        } else if (arg0 == 1001) {
            class477.method2799(class141.field2019, arg2, arg3);
        }
        if (arg1 > -116) {
            method347(28, (byte) 111, 122, 87);
        }
        field678++;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIZZ)V", line = 58)
    public class47(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field682 = arg3;
        this.field677 = arg2;
        this.field679 = arg4;
        this.field681 = arg1;
        this.field680 = arg0;
    }
}
