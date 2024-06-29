import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!YUXCUCXD")
public class Stats {

    @OriginalMember(owner = "client!YUXCUCXD", name = "a", descriptor = "I")
    public static int count = 25;

    @OriginalMember(owner = "client!YUXCUCXD", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] names = new String[] { "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "farming", "runecraft", "-unused-", "-unused-", "-unused-", "-unused-" };

    @OriginalMember(owner = "client!YUXCUCXD", name = "c", descriptor = "[Z")
    public static boolean[] enabled = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false, false, false };
}
