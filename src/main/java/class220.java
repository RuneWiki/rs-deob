import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class220 {

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field3613 = 0;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lph;")
    private static class229 field3616 = class266.method1858("Loaded textures", 0);

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "Lph;")
    public static class229 field3612 = field3616;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "Lph;")
    public static class229 field3620 = class266.method1858("Angreifen", 0);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public int field3610;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field3611;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public int field3619;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[S")
    public static short[] field3618;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V", line = 15)
    public static void method1537(byte arg0) {
        field3620 = null;
        field3612 = null;
        if (arg0 < 90) {
            method1537((byte) 101);
        }
        field3616 = null;
        field3618 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)V")
    public abstract void method266(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)V")
    public abstract void method271(int arg0, int arg1);
}
