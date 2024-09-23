import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("GQOSZKJC")
public class PathingEntity extends Entity {

    @OriginalMember(owner = "GQOSZKJC", name = "m", descriptor = "[I")
    public int[] pathTileX = new int[10];

    @OriginalMember(owner = "GQOSZKJC", name = "n", descriptor = "[I")
    public int[] pathTileZ = new int[10];

    @OriginalMember(owner = "GQOSZKJC", name = "o", descriptor = "I")
    public int targetId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "q", descriptor = "I")
    public int turnSpeed = 32;

    @OriginalMember(owner = "GQOSZKJC", name = "r", descriptor = "I")
    public int seqRunId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "t", descriptor = "I")
    public int height = 200;

    @OriginalMember(owner = "GQOSZKJC", name = "u", descriptor = "Z")
    private boolean _flowObfuscator6 = false;

    @OriginalMember(owner = "GQOSZKJC", name = "v", descriptor = "I")
    private int _flowObfuscator7 = -35698;

    @OriginalMember(owner = "GQOSZKJC", name = "x", descriptor = "I")
    public int seqStandId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "y", descriptor = "I")
    public int seqTurnId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "A", descriptor = "[I")
    public int[] damage = new int[4];

    @OriginalMember(owner = "GQOSZKJC", name = "B", descriptor = "[I")
    public int[] damageType = new int[4];

    @OriginalMember(owner = "GQOSZKJC", name = "C", descriptor = "[I")
    public int[] damageCycle = new int[4];

    @OriginalMember(owner = "GQOSZKJC", name = "D", descriptor = "I")
    public int secondarySeqId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "G", descriptor = "I")
    public int spotanimId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "M", descriptor = "I")
    public int primarySeqId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "S", descriptor = "I")
    public int combatCycle = -1000;

    @OriginalMember(owner = "GQOSZKJC", name = "V", descriptor = "I")
    public int chatTimer = 100;

    @OriginalMember(owner = "GQOSZKJC", name = "W", descriptor = "I")
    private int _flowObfuscator8 = -895;

    @OriginalMember(owner = "GQOSZKJC", name = "ab", descriptor = "I")
    public int size = 1;

    @OriginalMember(owner = "GQOSZKJC", name = "bb", descriptor = "Z")
    public boolean needsForwardDrawPadding = false;

    @OriginalMember(owner = "GQOSZKJC", name = "nb", descriptor = "[Z")
    public boolean[] pathRunning = new boolean[10];

    @OriginalMember(owner = "GQOSZKJC", name = "ob", descriptor = "I")
    public int seqWalkId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "pb", descriptor = "I")
    public int seqTurnAroundId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "qb", descriptor = "I")
    public int seqTurnLeftId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "rb", descriptor = "I")
    public int seqTurnRightId = -1;

    @OriginalMember(owner = "GQOSZKJC", name = "z", descriptor = "I")
    public int chatColor;

    @OriginalMember(owner = "GQOSZKJC", name = "R", descriptor = "I")
    public int chatStyle;

    @OriginalMember(owner = "GQOSZKJC", name = "X", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "GQOSZKJC", name = "w", descriptor = "I")
    public int dstYaw;

    @OriginalMember(owner = "GQOSZKJC", name = "hb", descriptor = "I")
    public int forceMoveEndCycle;

    @OriginalMember(owner = "GQOSZKJC", name = "eb", descriptor = "I")
    public int forceMoveEndSceneTileX;

    @OriginalMember(owner = "GQOSZKJC", name = "gb", descriptor = "I")
    public int forceMoveEndSceneTileZ;

    @OriginalMember(owner = "GQOSZKJC", name = "jb", descriptor = "I")
    public int forceMoveFaceDirection;

    @OriginalMember(owner = "GQOSZKJC", name = "ib", descriptor = "I")
    public int forceMoveStartCycle;

    @OriginalMember(owner = "GQOSZKJC", name = "db", descriptor = "I")
    public int forceMoveStartSceneTileX;

    @OriginalMember(owner = "GQOSZKJC", name = "fb", descriptor = "I")
    public int forceMoveStartSceneTileZ;

    @OriginalMember(owner = "GQOSZKJC", name = "T", descriptor = "I")
    public int health;

    @OriginalMember(owner = "GQOSZKJC", name = "L", descriptor = "I")
    public int pathLength;

    @OriginalMember(owner = "GQOSZKJC", name = "O", descriptor = "I")
    public int primarySeqCycle;

    @OriginalMember(owner = "GQOSZKJC", name = "P", descriptor = "I")
    public int primarySeqDelay;

    @OriginalMember(owner = "GQOSZKJC", name = "N", descriptor = "I")
    public int primarySeqFrame;

    @OriginalMember(owner = "GQOSZKJC", name = "Q", descriptor = "I")
    public int primarySeqLoop;

    @OriginalMember(owner = "GQOSZKJC", name = "F", descriptor = "I")
    public int secondarySeqCycle;

    @OriginalMember(owner = "GQOSZKJC", name = "E", descriptor = "I")
    public int secondarySeqFrame;

    @OriginalMember(owner = "GQOSZKJC", name = "cb", descriptor = "I")
    public int seqPathLength;

    @OriginalMember(owner = "GQOSZKJC", name = "p", descriptor = "I")
    public int seqTrigger;

    @OriginalMember(owner = "GQOSZKJC", name = "I", descriptor = "I")
    public int spotanimCycle;

    @OriginalMember(owner = "GQOSZKJC", name = "H", descriptor = "I")
    public int spotanimFrame;

    @OriginalMember(owner = "GQOSZKJC", name = "K", descriptor = "I")
    public int spotanimHeight;

    @OriginalMember(owner = "GQOSZKJC", name = "J", descriptor = "I")
    public int spotanimLastCycle;

    @OriginalMember(owner = "GQOSZKJC", name = "Y", descriptor = "I")
    public int targetTileX;

    @OriginalMember(owner = "GQOSZKJC", name = "Z", descriptor = "I")
    public int targetTileZ;

    @OriginalMember(owner = "GQOSZKJC", name = "U", descriptor = "I")
    public int totalHealth;

    @OriginalMember(owner = "GQOSZKJC", name = "kb", descriptor = "I")
    public int x;

    @OriginalMember(owner = "GQOSZKJC", name = "mb", descriptor = "I")
    public int yaw;

    @OriginalMember(owner = "GQOSZKJC", name = "lb", descriptor = "I")
    public int z;

    @OriginalMember(owner = "GQOSZKJC", name = "s", descriptor = "Ljava/lang/String;")
    public String chat;

    @OriginalMember(owner = "GQOSZKJC", name = "a", descriptor = "(IIZZ)V")
    public final void move(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (this.primarySeqId != -1 && SeqType.instances[this.primarySeqId].postanim_move == 1) {
            this.primarySeqId = -1;
        }
        if (!arg2) {
            int var5 = arg0 - this.pathTileX[0];
            int var6 = arg1 - this.pathTileZ[0];
            if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
                if (this.pathLength < 9) {
                    this.pathLength++;
                }
                for (int var7 = this.pathLength; var7 > 0; var7--) {
                    this.pathTileX[var7] = this.pathTileX[var7 - 1];
                    this.pathTileZ[var7] = this.pathTileZ[var7 - 1];
                    this.pathRunning[var7] = this.pathRunning[var7 - 1];
                }
                this.pathTileX[0] = arg0;
                this.pathTileZ[0] = arg1;
                this.pathRunning[0] = false;
                return;
            }
        }
        this.pathLength = 0;
        this.seqPathLength = 0;
        this.seqTrigger = 0;
        this.pathTileX[0] = arg0;
        this.pathTileZ[0] = arg1;
        this.x = this.pathTileX[0] * 128 + this.size * 64;
        if (arg3) {
            this._flowObfuscator8 = 42;
        }
        this.z = this.pathTileZ[0] * 128 + this.size * 64;
    }

    @OriginalMember(owner = "GQOSZKJC", name = "a", descriptor = "(Z)V")
    public final void resetPath(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        this.pathLength = 0;
        this.seqPathLength = 0;
    }

    @OriginalMember(owner = "GQOSZKJC", name = "a", descriptor = "(IIII)V")
    public final void hit(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < 4; var5++) {
            if (this.damageCycle[var5] <= arg3) {
                this.damage[var5] = arg2;
                this.damageType[var5] = arg1;
                this.damageCycle[var5] = arg3 + 70;
                return;
            }
        }
        if (this._flowObfuscator7 != arg0) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
    }

    @OriginalMember(owner = "GQOSZKJC", name = "a", descriptor = "(ZBI)V")
    public final void step(boolean arg0, byte arg1, int arg2) {
        int var4 = this.pathTileX[0];
        int var5 = this.pathTileZ[0];
        if (arg2 == 0) {
            var4--;
            var5++;
        }
        if (arg2 == 1) {
            var5++;
        }
        if (arg2 == 2) {
            var4++;
            var5++;
        }
        if (arg2 == 3) {
            var4--;
        }
        if (arg2 == 4) {
            var4++;
        }
        if (arg2 == 5) {
            var4--;
            var5--;
        }
        if (arg2 == 6) {
            var5--;
        }
        if (arg2 == 7) {
            var4++;
            var5--;
        }
        if (this.primarySeqId != -1 && SeqType.instances[this.primarySeqId].postanim_move == 1) {
            this.primarySeqId = -1;
        }
        if (this.pathLength < 9) {
            this.pathLength++;
        }
        for (int var6 = this.pathLength; var6 > 0; var6--) {
            this.pathTileX[var6] = this.pathTileX[var6 - 1];
            this.pathTileZ[var6] = this.pathTileZ[var6 - 1];
            this.pathRunning[var6] = this.pathRunning[var6 - 1];
        }
        if (arg1 == 20) {
            this.pathTileX[0] = var4;
            this.pathTileZ[0] = var5;
            this.pathRunning[0] = arg0;
        }
    }

    @OriginalMember(owner = "GQOSZKJC", name = "b", descriptor = "(Z)Z")
    public boolean isVisible(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return false;
    }
}
