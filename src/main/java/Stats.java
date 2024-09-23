import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("oc")
public class Stats {

    @OriginalMember(owner = "oc", name = "a", descriptor = "I")
    public static int field1162 = 25;

    @OriginalMember(owner = "oc", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1163 = new String[] { "attack", "defence", "strength", "hitpoints", "ranged", "prayer", "magic", "cooking", "woodcutting", "fletching", "fishing", "firemaking", "crafting", "smithing", "mining", "herblore", "agility", "thieving", "slayer", "-unused-", "runecraft", "-unused-", "-unused-", "-unused-", "-unused-" };

    @OriginalMember(owner = "oc", name = "c", descriptor = "[Z")
    public static boolean[] field1164 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false, false, false };
}
