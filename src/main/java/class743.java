import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class743 {

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public int field10317 = 0;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "[B")
    public byte[] field10319 = new byte[18002];

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "[I")
    public int[] field10324 = new int[256];

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public int field10318 = 0;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "[[I")
    public int[][] field10322 = new int[6][258];

    @OriginalMember(owner = "client!pn", name = "s", descriptor = "[I")
    public int[] field10333 = new int[257];

    @OriginalMember(owner = "client!pn", name = "v", descriptor = "[I")
    public int[] field10336 = new int[16];

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "[Z")
    public boolean[] field10321 = new boolean[256];

    @OriginalMember(owner = "client!pn", name = "z", descriptor = "[[B")
    public byte[][] field10340 = new byte[6][258];

    @OriginalMember(owner = "client!pn", name = "x", descriptor = "[I")
    public int[] field10338 = new int[6];

    @OriginalMember(owner = "client!pn", name = "C", descriptor = "[B")
    public byte[] field10343 = new byte[256];

    @OriginalMember(owner = "client!pn", name = "u", descriptor = "[B")
    public byte[] field10335 = new byte[4096];

    @OriginalMember(owner = "client!pn", name = "E", descriptor = "[B")
    public byte[] field10345 = new byte[18002];

    @OriginalMember(owner = "client!pn", name = "D", descriptor = "[[I")
    public int[][] field10344 = new int[6][258];

    @OriginalMember(owner = "client!pn", name = "q", descriptor = "[[I")
    public int[][] field10331 = new int[6][258];

    @OriginalMember(owner = "client!pn", name = "w", descriptor = "[Z")
    public boolean[] field10337 = new boolean[16];

    @OriginalMember(owner = "client!pn", name = "p", descriptor = "B")
    public byte field10330;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public int field10315;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public int field10316;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public int field10320;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public int field10325;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public int field10327;

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "I")
    public int field10328;

    @OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
    public int field10329;

    @OriginalMember(owner = "client!pn", name = "r", descriptor = "I")
    public int field10332;

    @OriginalMember(owner = "client!pn", name = "t", descriptor = "I")
    public int field10334;

    @OriginalMember(owner = "client!pn", name = "y", descriptor = "I")
    public int field10339;

    @OriginalMember(owner = "client!pn", name = "A", descriptor = "I")
    public int field10341;

    @OriginalMember(owner = "client!pn", name = "B", descriptor = "I")
    public int field10342;

    @OriginalMember(owner = "client!pn", name = "F", descriptor = "I")
    public int field10346;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "[B")
    public byte[] field10323;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "[B")
    public byte[] field10326;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(III)V")
    public static final void method4143(int arg0, int arg1, int arg2) {
        class165 var3 = class553.field7776[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        class461.method2739(var3.field2267);
        class461.method2739(var3.field2278);
        if (var3.field2267 != null) {
            var3.field2267 = null;
        }
        if (var3.field2278 != null) {
            var3.field2278 = null;
        }
    }
}
