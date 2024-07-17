import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("LKGEGIEW")
public class SeqType {

    @OriginalMember(owner = "LKGEGIEW", name = "a", descriptor = "I")
    private int _flowObfuscator1 = 9;

    @OriginalMember(owner = "LKGEGIEW", name = "b", descriptor = "Z")
    private boolean _flowObfuscator2 = false;

    @OriginalMember(owner = "LKGEGIEW", name = "i", descriptor = "I")
    public int replayoff = -1;

    @OriginalMember(owner = "LKGEGIEW", name = "k", descriptor = "Z")
    public boolean stretches = false;

    @OriginalMember(owner = "LKGEGIEW", name = "l", descriptor = "I")
    public int priority = 5;

    @OriginalMember(owner = "LKGEGIEW", name = "m", descriptor = "I")
    public int righthand = -1;

    @OriginalMember(owner = "LKGEGIEW", name = "n", descriptor = "I")
    public int lefthand = -1;

    @OriginalMember(owner = "LKGEGIEW", name = "o", descriptor = "I")
    public int replaycount = 99;

    @OriginalMember(owner = "LKGEGIEW", name = "p", descriptor = "I")
    public int preanim_move = -1;

    @OriginalMember(owner = "LKGEGIEW", name = "q", descriptor = "I")
    public int postanim_move = -1;

    @OriginalMember(owner = "LKGEGIEW", name = "r", descriptor = "I")
    public int replacemode = 2;

    @OriginalMember(owner = "LKGEGIEW", name = "t", descriptor = "I")
    public static int _flowObfuscator3;

    @OriginalMember(owner = "LKGEGIEW", name = "c", descriptor = "I")
    public static int count;

    @OriginalMember(owner = "LKGEGIEW", name = "s", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "LKGEGIEW", name = "e", descriptor = "I")
    public int frameCount;

    @OriginalMember(owner = "LKGEGIEW", name = "h", descriptor = "[I")
    private int[] delay;

    @OriginalMember(owner = "LKGEGIEW", name = "f", descriptor = "[I")
    public int[] frames;

    @OriginalMember(owner = "LKGEGIEW", name = "g", descriptor = "[I")
    public int[] iframes;

    @OriginalMember(owner = "LKGEGIEW", name = "j", descriptor = "[I")
    public int[] walkmerge;

    @OriginalMember(owner = "LKGEGIEW", name = "d", descriptor = "[LLKGEGIEW;")
    public static SeqType[] instances;

    @OriginalMember(owner = "LKGEGIEW", name = "a", descriptor = "(ILXTGLDHGX;)V")
    public static void unpack(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.read("seq.dat", null), 891);
        count = var2.g2();
        if (instances == null) {
            instances = new SeqType[count];
        }
        for (int var3 = 0; var3 < count; var3++) {
            if (instances[var3] == null) {
                instances[var3] = new SeqType();
            }
            instances[var3].decodeClient(true, var2);
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "LKGEGIEW", name = "a", descriptor = "(IB)I")
    public int getFrameDuration(int arg0, byte arg1) {
        int var3 = this.delay[arg0];
        if (arg1 != -39) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (var3 == 0) {
            AnimFrame var5 = AnimFrame.get(this._flowObfuscator1, this.frames[arg0]);
            if (var5 != null) {
                var3 = this.delay[arg0] = var5.id;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "LKGEGIEW", name = "a", descriptor = "(ZLMBMGIXGO;)V")
    public void decodeClient(boolean arg0, Packet arg1) {
        if (!arg0) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        while (true) {
            while (true) {
                int var3 = arg1.g1();
                if (var3 == 0) {
                    if (this.frameCount == 0) {
                        this.frameCount = 1;
                        this.frames = new int[1];
                        this.frames[0] = -1;
                        this.iframes = new int[1];
                        this.iframes[0] = -1;
                        this.delay = new int[1];
                        this.delay[0] = -1;
                    }
                    if (this.preanim_move == -1) {
                        if (this.walkmerge == null) {
                            this.preanim_move = 0;
                        } else {
                            this.preanim_move = 2;
                        }
                    }
                    if (this.postanim_move == -1) {
                        if (this.walkmerge != null) {
                            this.postanim_move = 2;
                            return;
                        }
                        this.postanim_move = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.frameCount = arg1.g1();
                    this.frames = new int[this.frameCount];
                    this.iframes = new int[this.frameCount];
                    this.delay = new int[this.frameCount];
                    for (int var4 = 0; var4 < this.frameCount; var4++) {
                        this.frames[var4] = arg1.g2();
                        this.iframes[var4] = arg1.g2();
                        if (this.iframes[var4] == 65535) {
                            this.iframes[var4] = -1;
                        }
                        this.delay[var4] = arg1.g2();
                    }
                } else if (var3 == 2) {
                    this.replayoff = arg1.g2();
                } else if (var3 == 3) {
                    int var5 = arg1.g1();
                    this.walkmerge = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.walkmerge[var6] = arg1.g1();
                    }
                    this.walkmerge[var5] = 9999999;
                } else if (var3 == 4) {
                    this.stretches = true;
                } else if (var3 == 5) {
                    this.priority = arg1.g1();
                } else if (var3 == 6) {
                    this.righthand = arg1.g2();
                } else if (var3 == 7) {
                    this.lefthand = arg1.g2();
                } else if (var3 == 8) {
                    this.replaycount = arg1.g1();
                } else if (var3 == 9) {
                    this.preanim_move = arg1.g1();
                } else if (var3 == 10) {
                    this.postanim_move = arg1.g1();
                } else if (var3 == 11) {
                    this.replacemode = arg1.g1();
                } else if (var3 == 12) {
                    this.field1027 = arg1.g4();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
