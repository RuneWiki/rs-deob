import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("GHOWLKWN")
public class OnDemand extends OnDemandProvider implements Runnable {

    @OriginalMember(owner = "GHOWLKWN", name = "c", descriptor = "LLHGXPZPG;")
    private LinkList pending = new LinkList(169);

    @OriginalMember(owner = "GHOWLKWN", name = "e", descriptor = "Ljava/lang/String;")
    public String message = "";

    @OriginalMember(owner = "GHOWLKWN", name = "h", descriptor = "Z")
    private boolean _flowObfuscator2 = true;

    @OriginalMember(owner = "GHOWLKWN", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 crc32 = new CRC32();

    @OriginalMember(owner = "GHOWLKWN", name = "k", descriptor = "[B")
    private byte[] buf = new byte[500];

    @OriginalMember(owner = "GHOWLKWN", name = "l", descriptor = "I")
    private int _flowObfuscator3 = 923;

    @OriginalMember(owner = "GHOWLKWN", name = "n", descriptor = "[[B")
    private byte[][] archiveFilePriorities = new byte[4][];

    @OriginalMember(owner = "GHOWLKWN", name = "p", descriptor = "LLHGXPZPG;")
    private LinkList prefetches = new LinkList(169);

    @OriginalMember(owner = "GHOWLKWN", name = "x", descriptor = "I")
    private int _flowObfuscator5 = 13603;

    @OriginalMember(owner = "GHOWLKWN", name = "y", descriptor = "Z")
    private boolean running = true;

    @OriginalMember(owner = "GHOWLKWN", name = "A", descriptor = "Z")
    private boolean _flowObfuscator6 = false;

    @OriginalMember(owner = "GHOWLKWN", name = "C", descriptor = "Z")
    private boolean active = false;

    @OriginalMember(owner = "GHOWLKWN", name = "D", descriptor = "LLHGXPZPG;")
    private LinkList completed = new LinkList(169);

    @OriginalMember(owner = "GHOWLKWN", name = "E", descriptor = "[B")
    private byte[] data = new byte[65000];

    @OriginalMember(owner = "GHOWLKWN", name = "G", descriptor = "LBISVHPUN;")
    private DoublyLinkList requests = new DoublyLinkList(_flowObfuscator4);

    @OriginalMember(owner = "GHOWLKWN", name = "J", descriptor = "[[I")
    private int[][] archiveFileVersions = new int[4][];

    @OriginalMember(owner = "GHOWLKWN", name = "K", descriptor = "[[I")
    private int[][] archiveFileChecksums = new int[4][];

    @OriginalMember(owner = "GHOWLKWN", name = "N", descriptor = "LLHGXPZPG;")
    private LinkList missing = new LinkList(169);

    @OriginalMember(owner = "GHOWLKWN", name = "P", descriptor = "LLHGXPZPG;")
    private LinkList queue = new LinkList(169);

    @OriginalMember(owner = "GHOWLKWN", name = "q", descriptor = "I")
    private static int _flowObfuscator4;

    @OriginalMember(owner = "GHOWLKWN", name = "m", descriptor = "I")
    public int cycle;

    @OriginalMember(owner = "GHOWLKWN", name = "u", descriptor = "I")
    public int failCount;

    @OriginalMember(owner = "GHOWLKWN", name = "f", descriptor = "I")
    private int heartbeatCycle;

    @OriginalMember(owner = "GHOWLKWN", name = "L", descriptor = "I")
    private int importantCount;

    @OriginalMember(owner = "GHOWLKWN", name = "w", descriptor = "I")
    private int loadedPrefetchFiles;

    @OriginalMember(owner = "GHOWLKWN", name = "s", descriptor = "I")
    private int partAvailable;

    @OriginalMember(owner = "GHOWLKWN", name = "r", descriptor = "I")
    private int partOffset;

    @OriginalMember(owner = "GHOWLKWN", name = "M", descriptor = "I")
    private int requestCount;

    @OriginalMember(owner = "GHOWLKWN", name = "d", descriptor = "I")
    private int topPriority;

    @OriginalMember(owner = "GHOWLKWN", name = "b", descriptor = "I")
    private int totalPrefetchFiles;

    @OriginalMember(owner = "GHOWLKWN", name = "S", descriptor = "I")
    private int waitCycles;

    @OriginalMember(owner = "GHOWLKWN", name = "g", descriptor = "J")
    private long socketOpenTime;

    @OriginalMember(owner = "GHOWLKWN", name = "O", descriptor = "LPHKHJKBS;")
    private OnDemandRequest current;

    @OriginalMember(owner = "GHOWLKWN", name = "o", descriptor = "Lclient;")
    private client app;

    @OriginalMember(owner = "GHOWLKWN", name = "H", descriptor = "Ljava/io/InputStream;")
    private InputStream in;

    @OriginalMember(owner = "GHOWLKWN", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream out;

    @OriginalMember(owner = "GHOWLKWN", name = "I", descriptor = "Ljava/net/Socket;")
    private Socket socket;

    @OriginalMember(owner = "GHOWLKWN", name = "R", descriptor = "[B")
    private byte[] modelIndex;

    @OriginalMember(owner = "GHOWLKWN", name = "F", descriptor = "[I")
    private int[] animIndex;

    @OriginalMember(owner = "GHOWLKWN", name = "Q", descriptor = "[I")
    private int[] mapIndex;

    @OriginalMember(owner = "GHOWLKWN", name = "v", descriptor = "[I")
    private int[] mapLand;

    @OriginalMember(owner = "GHOWLKWN", name = "i", descriptor = "[I")
    private int[] mapLoc;

    @OriginalMember(owner = "GHOWLKWN", name = "B", descriptor = "[I")
    private int[] mapPrefetch;

    @OriginalMember(owner = "GHOWLKWN", name = "t", descriptor = "[I")
    private int[] midiIndex;

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(IBI[B)Z")
    private final boolean validate(int arg0, byte arg1, int arg2, byte[] arg3) {
        if (arg3 == null || arg3.length < 2) {
            return false;
        }
        int var5 = arg3.length - 2;
        int var6 = ((arg3[var5] & 0xFF) << 8) + (arg3[var5 + 1] & 0xFF);
        if (arg1 != 3) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        this.crc32.reset();
        this.crc32.update(arg3, 0, var5);
        int var7 = (int) this.crc32.getValue();
        if (arg0 == var6) {
            return arg2 == var7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "b", descriptor = "(I)V")
    private final void read(int arg0) {
        if (arg0 >= 0) {
            this._flowObfuscator2 = !this._flowObfuscator2;
        }
        try {
            int var2 = this.in.available();
            if (this.partAvailable == 0 && var2 >= 6) {
                this.active = true;
                for (int var3 = 0; var3 < 6; var3 += this.in.read(this.buf, var3, 6 - var3)) {
                }
                int var4 = this.buf[0] & 0xFF;
                int var5 = ((this.buf[1] & 0xFF) << 8) + (this.buf[2] & 0xFF);
                int var6 = ((this.buf[3] & 0xFF) << 8) + (this.buf[4] & 0xFF);
                int var7 = this.buf[5] & 0xFF;
                this.current = null;
                for (OnDemandRequest var8 = (OnDemandRequest) this.pending.head(); var8 != null; var8 = (OnDemandRequest) this.pending.next(false)) {
                    if (var8.archive == var4 && var8.file == var5) {
                        this.current = var8;
                    }
                    if (this.current != null) {
                        var8.cycle = 0;
                    }
                }
                if (this.current != null) {
                    this.waitCycles = 0;
                    if (var6 == 0) {
                        signlink.reporterror("Rej: " + var4 + "," + var5);
                        this.current.data = null;
                        if (this.current.important) {
                            LinkList var9 = this.completed;
                            synchronized (this.completed) {
                                this.completed.addTail(this.current);
                            }
                        } else {
                            this.current.unlink();
                        }
                        this.current = null;
                    } else {
                        if (this.current.data == null && var7 == 0) {
                            this.current.data = new byte[var6];
                        }
                        if (this.current.data == null && var7 != 0) {
                            throw new IOException("missing start of file");
                        }
                    }
                }
                this.partOffset = var7 * 500;
                this.partAvailable = 500;
                if (this.partAvailable > var6 - var7 * 500) {
                    this.partAvailable = var6 - var7 * 500;
                }
            }
            if (this.partAvailable > 0 && var2 >= this.partAvailable) {
                this.active = true;
                byte[] var10 = this.buf;
                int var11 = 0;
                if (this.current != null) {
                    var10 = this.current.data;
                    var11 = this.partOffset;
                }
                for (int var12 = 0; var12 < this.partAvailable; var12 += this.in.read(var10, var11 + var12, this.partAvailable - var12)) {
                }
                if (this.partOffset + this.partAvailable >= var10.length && this.current != null) {
                    if (this.app.fileStreams[0] != null) {
                        this.app.fileStreams[this.current.archive + 1].write(var10.length, var10, (byte) 2, this.current.file);
                    }
                    if (!this.current.important && this.current.archive == 3) {
                        this.current.important = true;
                        this.current.archive = 93;
                    }
                    if (this.current.important) {
                        LinkList var13 = this.completed;
                        synchronized (this.completed) {
                            this.completed.addTail(this.current);
                        }
                    } else {
                        this.current.unlink();
                    }
                }
                this.partAvailable = 0;
            }
        } catch (IOException var18) {
            try {
                this.socket.close();
            } catch (Exception var15) {
            }
            this.socket = null;
            this.in = null;
            this.out = null;
            this.partAvailable = 0;
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(LXTGLDHGX;Lclient;)V")
    public final void load(Jagfile arg0, client arg1) {
        String[] var3 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
        for (int var4 = 0; var4 < 4; var4++) {
            byte[] var26 = arg0.read(var3[var4], null);
            int var27 = var26.length / 2;
            Packet var28 = new Packet(var26, 891);
            this.archiveFileVersions[var4] = new int[var27];
            this.archiveFilePriorities[var4] = new byte[var27];
            for (int var29 = 0; var29 < var27; var29++) {
                this.archiveFileVersions[var4][var29] = var28.g2();
            }
        }
        String[] var5 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
        for (int var6 = 0; var6 < 4; var6++) {
            byte[] var22 = arg0.read(var5[var6], null);
            int var23 = var22.length / 4;
            Packet var24 = new Packet(var22, 891);
            this.archiveFileChecksums[var6] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                this.archiveFileChecksums[var6][var25] = var24.g4();
            }
        }
        byte[] var7 = arg0.read("model_index", null);
        int var8 = this.archiveFileVersions[0].length;
        this.modelIndex = new byte[var8];
        for (int var9 = 0; var9 < var8; var9++) {
            if (var9 < var7.length) {
                this.modelIndex[var9] = var7[var9];
            } else {
                this.modelIndex[var9] = 0;
            }
        }
        byte[] var10 = arg0.read("map_index", null);
        Packet var11 = new Packet(var10, 891);
        int var12 = var10.length / 7;
        this.mapIndex = new int[var12];
        this.mapLand = new int[var12];
        this.mapLoc = new int[var12];
        this.mapPrefetch = new int[var12];
        for (int var13 = 0; var13 < var12; var13++) {
            this.mapIndex[var13] = var11.g2();
            this.mapLand[var13] = var11.g2();
            this.mapLoc[var13] = var11.g2();
            this.mapPrefetch[var13] = var11.g1();
        }
        byte[] var14 = arg0.read("anim_index", null);
        Packet var15 = new Packet(var14, 891);
        int var16 = var14.length / 2;
        this.animIndex = new int[var16];
        for (int var17 = 0; var17 < var16; var17++) {
            this.animIndex[var17] = var15.g2();
        }
        byte[] var18 = arg0.read("midi_index", null);
        Packet var19 = new Packet(var18, 891);
        int var20 = var18.length;
        this.midiIndex = new int[var20];
        for (int var21 = 0; var21 < var20; var21++) {
            this.midiIndex[var21] = var19.g1();
        }
        this.app = arg1;
        this.running = true;
        this.app.startThread(this, 2);
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "()I")
    public final int remaining() {
        DoublyLinkList var1 = this.requests;
        synchronized (this.requests) {
            return this.requests.size();
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "b", descriptor = "()V")
    public final void stop() {
        this.running = false;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(ZI)V")
    public final void prefetchMaps(boolean arg0, int arg1) {
        int var3 = this.mapIndex.length;
        if (arg1 != 0) {
            _flowObfuscator4 = 20;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            if (arg0 || this.mapPrefetch[var4] != 0) {
                this.prefetch((byte) 2, 3, this.mapLoc[var4], (byte) 8);
                this.prefetch((byte) 2, 3, this.mapLand[var4], (byte) 8);
            }
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(II)I")
    public final int getFileCount(int arg0, int arg1) {
        if (arg0 <= 0) {
            this._flowObfuscator6 = !this._flowObfuscator6;
        }
        return this.archiveFileVersions[arg1].length;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(ILPHKHJKBS;)V")
    private final void send(int arg0, OnDemandRequest arg1) {
        if (arg0 < 8 || arg0 > 8) {
            this._flowObfuscator5 = -339;
        }
        try {
            if (this.socket == null) {
                long var3 = System.currentTimeMillis();
                if (var3 - this.socketOpenTime < 4000L) {
                    return;
                }
                this.socketOpenTime = var3;
                this.socket = this.app.openSocket(client.portOffset + 43594);
                this.in = this.socket.getInputStream();
                this.out = this.socket.getOutputStream();
                this.out.write(15);
                for (int var5 = 0; var5 < 8; var5++) {
                    this.in.read();
                }
                this.waitCycles = 0;
            }
            this.buf[0] = (byte) arg1.archive;
            this.buf[1] = (byte) (arg1.file >> 8);
            this.buf[2] = (byte) arg1.file;
            if (arg1.important) {
                this.buf[3] = 2;
            } else if (this.app.ingame) {
                this.buf[3] = 0;
            } else {
                this.buf[3] = 1;
            }
            this.out.write(this.buf, 0, 4);
            this.heartbeatCycle = 0;
            this.failCount = -10000;
        } catch (IOException var8) {
            try {
                this.socket.close();
            } catch (Exception var7) {
            }
            this.socket = null;
            this.in = null;
            this.out = null;
            this.partAvailable = 0;
            this.failCount++;
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "c", descriptor = "(I)I")
    public final int getAnimCount(int arg0) {
        if (arg0 != 0) {
            this._flowObfuscator5 = -76;
        }
        return this.animIndex.length;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "b", descriptor = "(II)V")
    public final void request(int arg0, int arg1) {
        if (arg0 < 0 || arg0 > this.archiveFileVersions.length || arg1 < 0 || arg1 > this.archiveFileVersions[arg0].length || this.archiveFileVersions[arg0][arg1] == 0) {
            return;
        }
        DoublyLinkList var3 = this.requests;
        synchronized (this.requests) {
            for (OnDemandRequest var4 = (OnDemandRequest) this.requests.head(); var4 != null; var4 = (OnDemandRequest) this.requests.next(false)) {
                if (var4.archive == arg0 && var4.file == arg1) {
                    return;
                }
            }
            OnDemandRequest var5 = new OnDemandRequest();
            var5.archive = arg0;
            var5.file = arg1;
            var5.important = true;
            LinkList var6 = this.queue;
            synchronized (this.queue) {
                this.queue.addTail(var5);
            }
            this.requests.addTail(var5);
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "c", descriptor = "(II)I")
    public final int getModelFlags(int arg0, int arg1) {
        if (arg1 >= 0) {
            _flowObfuscator4 = -7;
        }
        return this.modelIndex[arg0] & 0xFF;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "run", descriptor = "()V")
    public final void run() {
        try {
            while (this.running) {
                this.cycle++;
                byte var1 = 20;
                if (this.topPriority == 0 && this.app.fileStreams[0] != null) {
                    var1 = 50;
                }
                try {
                    Thread.sleep((long) var1);
                } catch (Exception var9) {
                }
                this.active = true;
                for (int var2 = 0; var2 < 100 && this.active; var2++) {
                    this.active = false;
                    this.handleQueue(true);
                    this.handlePending(false);
                    if (this.importantCount == 0 && var2 >= 5) {
                        break;
                    }
                    this.handleExtras((byte) -56);
                    if (this.in != null) {
                        this.read(-369);
                    }
                }
                boolean var3 = false;
                for (OnDemandRequest var4 = (OnDemandRequest) this.pending.head(); var4 != null; var4 = (OnDemandRequest) this.pending.next(false)) {
                    if (var4.important) {
                        var3 = true;
                        var4.cycle++;
                        if (var4.cycle > 50) {
                            var4.cycle = 0;
                            this.send(8, var4);
                        }
                    }
                }
                if (!var3) {
                    for (OnDemandRequest var5 = (OnDemandRequest) this.pending.head(); var5 != null; var5 = (OnDemandRequest) this.pending.next(false)) {
                        var3 = true;
                        var5.cycle++;
                        if (var5.cycle > 50) {
                            var5.cycle = 0;
                            this.send(8, var5);
                        }
                    }
                }
                if (var3) {
                    this.waitCycles++;
                    if (this.waitCycles > 750) {
                        try {
                            this.socket.close();
                        } catch (Exception var8) {
                        }
                        this.socket = null;
                        this.in = null;
                        this.out = null;
                        this.partAvailable = 0;
                    }
                } else {
                    this.waitCycles = 0;
                    this.message = "";
                }
                if (this.app.ingame && this.socket != null && this.out != null && (this.topPriority > 0 || this.app.fileStreams[0] == null)) {
                    this.heartbeatCycle++;
                    if (this.heartbeatCycle > 500) {
                        this.heartbeatCycle = 0;
                        this.buf[0] = 0;
                        this.buf[1] = 0;
                        this.buf[2] = 0;
                        this.buf[3] = 10;
                        try {
                            this.out.write(this.buf, 0, 4);
                        } catch (IOException var7) {
                            this.waitCycles = 5000;
                        }
                    }
                }
            }
        } catch (Exception var10) {
            signlink.reporterror("od_ex " + var10.getMessage());
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(IIZ)V")
    public final void prefetch(int arg0, int arg1, boolean arg2) {
        if (this.app.fileStreams[0] == null || (this.archiveFileVersions[arg1][arg0] == 0 || (this.archiveFilePriorities[arg1][arg0] == 0 || this.topPriority == 0))) {
            return;
        }
        OnDemandRequest var4 = new OnDemandRequest();
        var4.archive = arg1;
        var4.file = arg0;
        if (arg2) {
            _flowObfuscator4 = -423;
        }
        var4.important = false;
        LinkList var5 = this.prefetches;
        synchronized (this.prefetches) {
            this.prefetches.addTail(var4);
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "c", descriptor = "()LPHKHJKBS;")
    public final OnDemandRequest poll() {
        LinkList var1 = this.completed;
        OnDemandRequest var2;
        synchronized (this.completed) {
            var2 = (OnDemandRequest) this.completed.removeHead();
        }
        if (var2 == null) {
            return null;
        }
        DoublyLinkList var3 = this.requests;
        synchronized (this.requests) {
            var2.unlinkDouble();
        }
        if (var2.data == null) {
            return var2;
        }
        int var4 = 0;
        try {
            GZIPInputStream var5 = new GZIPInputStream(new ByteArrayInputStream(var2.data));
            while (true) {
                if (this.data.length == var4) {
                    throw new RuntimeException("buffer overflow!");
                }
                int var6 = var5.read(this.data, var4, this.data.length - var4);
                if (var6 == -1) {
                    break;
                }
                var4 += var6;
            }
        } catch (IOException var10) {
            throw new RuntimeException("error unzipping");
        }
        var2.data = new byte[var4];
        for (int var7 = 0; var7 < var4; var7++) {
            var2.data[var7] = this.data[var7];
        }
        return var2;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(IIII)I")
    public final int getMapFile(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return _flowObfuscator4;
        }
        int var5 = (arg3 << 8) + arg2;
        for (int var6 = 0; var6 < this.mapIndex.length; var6++) {
            if (this.mapIndex[var6] == var5) {
                if (arg0 == 0) {
                    return this.mapLand[var6];
                }
                return this.mapLoc[var6];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(I)V")
    public final void requestModel(int arg0) {
        this.request(0, arg0);
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(BIIB)V")
    public final void prefetch(byte arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 8) {
            boolean var5 = false;
        } else {
            this._flowObfuscator3 = 237;
        }
        if (this.app.fileStreams[0] == null || this.archiveFileVersions[arg1][arg2] == 0) {
            return;
        }
        byte[] var6 = this.app.fileStreams[arg1 + 1].read(true, arg2);
        if (this.validate(this.archiveFileVersions[arg1][arg2], (byte) 3, this.archiveFileChecksums[arg1][arg2], var6)) {
            return;
        }
        this.archiveFilePriorities[arg1][arg2] = arg0;
        if (arg0 > this.topPriority) {
            this.topPriority = arg0;
        }
        this.totalPrefetchFiles++;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "d", descriptor = "(II)Z")
    public final boolean hasMapLocFile(int arg0, int arg1) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.mapIndex.length; var3++) {
            if (this.mapLoc[var3] == arg0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(Z)V")
    private final void handlePending(boolean arg0) {
        this.importantCount = 0;
        if (arg0) {
            return;
        }
        this.requestCount = 0;
        for (OnDemandRequest var2 = (OnDemandRequest) this.pending.head(); var2 != null; var2 = (OnDemandRequest) this.pending.next(false)) {
            if (var2.important) {
                this.importantCount++;
            } else {
                this.requestCount++;
            }
        }
        while (this.importantCount < 10) {
            OnDemandRequest var3 = (OnDemandRequest) this.missing.removeHead();
            if (var3 == null) {
                break;
            }
            if (this.archiveFilePriorities[var3.archive][var3.file] != 0) {
                this.loadedPrefetchFiles++;
            }
            this.archiveFilePriorities[var3.archive][var3.file] = 0;
            this.pending.addTail(var3);
            this.importantCount++;
            this.send(8, var3);
            this.active = true;
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "d", descriptor = "(I)V")
    public final void clearPrefetches(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        LinkList var3 = this.prefetches;
        synchronized (this.prefetches) {
            this.prefetches.clear();
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "b", descriptor = "(Z)V")
    private final void handleQueue(boolean arg0) {
        if (!arg0) {
            return;
        }
        LinkList var2 = this.queue;
        OnDemandRequest var3;
        synchronized (this.queue) {
            var3 = (OnDemandRequest) this.queue.removeHead();
        }
        while (var3 != null) {
            this.active = true;
            byte[] var4 = null;
            if (this.app.fileStreams[0] != null) {
                var4 = this.app.fileStreams[var3.archive + 1].read(true, var3.file);
            }
            if (!this.validate(this.archiveFileVersions[var3.archive][var3.file], (byte) 3, this.archiveFileChecksums[var3.archive][var3.file], var4)) {
                var4 = null;
            }
            LinkList var5 = this.queue;
            synchronized (this.queue) {
                if (var4 == null) {
                    this.missing.addTail(var3);
                } else {
                    var3.data = var4;
                    LinkList var6 = this.completed;
                    synchronized (this.completed) {
                        this.completed.addTail(var3);
                    }
                }
                var3 = (OnDemandRequest) this.queue.removeHead();
            }
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "a", descriptor = "(B)V")
    private final void handleExtras(byte arg0) {
        if (arg0 != -56) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (this.importantCount == 0) {
            if (this.requestCount >= 10 || this.topPriority == 0) {
                return;
            }
            LinkList var3 = this.prefetches;
            OnDemandRequest var4;
            synchronized (this.prefetches) {
                var4 = (OnDemandRequest) this.prefetches.removeHead();
            }
            while (var4 != null) {
                if (this.archiveFilePriorities[var4.archive][var4.file] != 0) {
                    this.archiveFilePriorities[var4.archive][var4.file] = 0;
                    this.pending.addTail(var4);
                    this.send(8, var4);
                    this.active = true;
                    if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
                        this.loadedPrefetchFiles++;
                    }
                    this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
                    this.requestCount++;
                    if (this.requestCount == 10) {
                        return;
                    }
                }
                LinkList var5 = this.prefetches;
                synchronized (this.prefetches) {
                    var4 = (OnDemandRequest) this.prefetches.removeHead();
                }
            }
            for (int var6 = 0; var6 < 4; var6++) {
                byte[] var7 = this.archiveFilePriorities[var6];
                int var8 = var7.length;
                for (int var9 = 0; var9 < var8; var9++) {
                    if (var7[var9] == this.topPriority) {
                        var7[var9] = 0;
                        OnDemandRequest var10 = new OnDemandRequest();
                        var10.archive = var6;
                        var10.file = var9;
                        var10.important = false;
                        this.pending.addTail(var10);
                        this.send(8, var10);
                        this.active = true;
                        if (this.loadedPrefetchFiles < this.totalPrefetchFiles) {
                            this.loadedPrefetchFiles++;
                        }
                        this.message = "Loading extra files - " + this.loadedPrefetchFiles * 100 / this.totalPrefetchFiles + "%";
                        this.requestCount++;
                        if (this.requestCount == 10) {
                            return;
                        }
                    }
                }
            }
            this.topPriority--;
        }
    }

    @OriginalMember(owner = "GHOWLKWN", name = "e", descriptor = "(II)Z")
    public final boolean shouldPrefetchMidi(int arg0, int arg1) {
        if (arg1 != 5) {
            _flowObfuscator4 = 169;
        }
        return this.midiIndex[arg0] == 1;
    }
}
