import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WCVISEZF")
public class Stats {

    @OriginalMember(owner = "client!WCVISEZF", name = "a", descriptor = "I")
    public static int field1503 = 25;

    @OriginalMember(owner = "client!WCVISEZF", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1504 = new String[] { "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "farming", "runecraft", "yodelling", "hexediting", "-unused-", "-unused-" };

    @OriginalMember(owner = "client!WCVISEZF", name = "c", descriptor = "[Z")
    public static boolean[] field1505 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false };
}
