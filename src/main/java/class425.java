import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class425 implements class525 {

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "[[S")
    private static short[][] field6000 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "[[S")
    private static short[][] field6019 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ob", name = "M", descriptor = "[[S")
    private static short[][] field6026 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "[F")
    public static float[] field6022 = new float[16];

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "[[S")
    private static short[][] field6023 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "[[[S")
    public static short[][][] field5997 = new short[][][] { field6026, field6000, field6019, field6023 };

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    private int field5993;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field5995;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    private int field5998;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    private int field6004;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    private int field6006;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    private int field6013;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field6016;

    @OriginalMember(owner = "client!ob", name = "H", descriptor = "I")
    public static int field6021;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "I")
    private int field6027;

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    private int field6028;

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!ob", name = "R", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Ltf;")
    public static class701 field5992;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Ljava/awt/Color;")
    private Color field5996;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Ljava/awt/Font;")
    private Font field5989;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Ljava/awt/FontMetrics;")
    private FontMetrics field6009;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/awt/Image;")
    private Image field5991;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Ljava/awt/Image;")
    private Image field5994;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Ljava/awt/Image;")
    private Image field5999;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Ljava/awt/Image;")
    private Image field6003;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "Ljava/awt/Image;")
    private Image field6011;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Ljava/awt/Image;")
    private Image field6017;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "Ljava/awt/Image;")
    private Image field6018;

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Ljava/awt/Image;")
    private Image field6020;

    @OriginalMember(owner = "client!ob", name = "K", descriptor = "Ljava/awt/Image;")
    private Image field6024;

    @OriginalMember(owner = "client!ob", name = "T", descriptor = "Ljava/awt/Image;")
    private Image field6033;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
    private boolean field5990;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Z")
    private boolean field6010;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "Z")
    private boolean field6030;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 3)
    private final void method2445(byte arg0) {
        class151.method824(class203.field2404.method3090((byte) 98), false, class203.field2404.method3089(98), class414.field5556[class249.field3090], class312.field3853[class249.field3090], class158.field1782[class249.field3090]);
        if (arg0 < 35) {
            this.field5990 = true;
        }
        field6021++;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 30)
    public static void method2446(int arg0) {
        field5997 = null;
        if (arg0 != -12918) {
            return;
        }
        field5992 = null;
        field6026 = null;
        field6019 = null;
        field6022 = null;
        field6000 = null;
        field6023 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I", line = 48)
    public final int method2447(byte arg0) {
        if (arg0 == -93) {
            field6014++;
            return 0;
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;", line = 68)
    private final Object method2448(Class arg0, String arg1, int arg2) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 != 31024) {
            this.method2458(11);
        }
        field6032++;
        Field var4 = arg0.getDeclaredField(arg1);
        Object var5 = var4.get(class591.field8347);
        var4.set(class591.field8347, null);
        return var5;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I", line = 89)
    private final int method2449(int arg0, int arg1) {
        field6002++;
        if (arg0 != 0) {
            field5992 = null;
        }
        return this.field5990 ? (class146.field1618 - arg1) / 2 : 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 107)
    public final void method2450(int arg0) {
        if (arg0 != -4211) {
            this.method2450(95);
        }
        field6016++;
        class368.method2156((byte) -126);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)Z", line = 119)
    public final boolean method2451(int arg0, long arg1) {
        field6029++;
        int var4 = -55 % ((-arg0 - 58) / 50);
        return true;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZB)V", line = 132)
    public final void method2452(boolean arg0, byte arg1) {
        if (!this.field6010) {
            if (class591.field8347 == null) {
                this.field6010 = true;
            } else if (this.field5989 == null) {
                try {
                    this.method2457((byte) 126);
                } catch (Exception var44) {
                    this.field6010 = true;
                }
            }
        }
        field6031++;
        if (this.field6010) {
            this.method2445((byte) 86);
            return;
        }
        Graphics var3 = class41.field407.getGraphics();
        if (var3 == null) {
            class41.field407.repaint();
        } else {
            try {
                int var4 = class203.field2404.method3089(84);
                String var5 = class203.field2404.method3090((byte) 98);
                if (class461.field6560 == null) {
                    class461.field6560 = class41.field407.createImage(class146.field1618, class338.field4244);
                }
                Graphics var6 = class461.field6560.getGraphics();
                int var7 = this.field6020.getWidth(null);
                int var8 = this.field5994.getWidth(null);
                int var9 = this.field6018.getWidth(null);
                int var10 = this.field6020.getHeight(null);
                int var11 = this.field5994.getHeight(null);
                int var12 = this.field6018.getHeight(null);
                var6.drawImage(this.field6020, this.method2449(0, var7) + this.field6027 - this.field5995 / 2, this.method2453(var10, 0) - -this.field6013, null);
                int var13 = this.field6027 + var7 - this.field5995 / 2;
                int var14 = this.field5995 / 2 + this.field6027 - var8;
                for (int var15 = var13; var15 <= var14; var15 += var9) {
                    var6.drawImage(this.field6018, this.method2449(0, var7) + this.field6027 + var15, this.method2453(var12, 0) + this.field6013, null);
                }
                var6.drawImage(this.field5994, this.method2449(0, var8) + this.field6027 + (this.field5995 / 2), this.method2453(var11, 0) - -this.field6013, null);
                int var16 = this.field6017.getWidth(null);
                int var17 = this.field6017.getHeight(null);
                int var18 = this.field6024.getWidth(null);
                int var19 = this.field6024.getHeight(null);
                int var20 = this.field5999.getHeight(null);
                int var21 = this.field6003.getWidth(null);
                int var22 = this.field6003.getHeight(null);
                int var23 = this.field5999.getWidth(null);
                int var24 = this.field5991.getWidth(null);
                int var25 = this.field6011.getWidth(null);
                int var26 = this.method2449(0, this.field6028) + this.field6006;
                int var27 = this.method2453(this.field5993, 0) + this.field6025;
                var6.drawImage(this.field6017, var26, (this.field5993 - var17) / 2 + var27, null);
                var6.drawImage(this.field6024, var26 + this.field6028 - var18, (-var19 + this.field5993) / 2 + var27, null);
                if (this.field6033 == null) {
                    this.field6033 = class41.field407.createImage(this.field6028 - (var16 + var18), this.field5993);
                }
                Graphics var28 = this.field6033.getGraphics();
                for (int var29 = 0; var29 < this.field6028 - var16 - var18; var29 += var21) {
                    var28.drawImage(this.field6003, var29, 0, null);
                }
                for (int var30 = 0; var30 < (this.field6028 - var16 - var18); var30 += var23) {
                    var28.drawImage(this.field5999, var30, this.field5993 - var20, null);
                }
                int var31 = (this.field6028 - var16 - var18) * var4 / 100;
                if (var31 > 0) {
                    Image var32 = class41.field407.createImage(var31, this.field5993 - var22 - var20);
                    int var33 = var32.getWidth(null);
                    Graphics var34 = var32.getGraphics();
                    int var35 = this.field5998 * class701.method3872(-12973) / 10 % var24;
                    for (int var36 = var35 - var24; var36 < var33; var36 += var24) {
                        var34.drawImage(this.field5991, var36, 0, null);
                    }
                    var28.drawImage(var32, 0, var22, null);
                }
                int var38 = this.field6028 - var16 - var18 - var31;
                if (var38 > 0) {
                    Image var39 = class41.field407.createImage(var38, this.field5993 - var22 - var20);
                    int var40 = var39.getWidth(null);
                    Graphics var41 = var39.getGraphics();
                    for (int var42 = 0; var42 < var40; var42 += var25) {
                        var41.drawImage(this.field6011, var42, 0, null);
                    }
                    var28.drawImage(var39, var31, var22, null);
                }
                var6.drawImage(this.field6033, var16 + var26, var27, null);
                var6.setFont(this.field5989);
                var6.setColor(this.field5996);
                var6.drawString(var5, (this.field6028 - this.field6009.stringWidth(var5)) / 2 + var26, this.field5993 / 2 + var27 - (-this.field6004 + -4));
                var3.drawImage(class461.field6560, 0, 0, null);
            } catch (Exception var45) {
                this.field6010 = true;
            }
        }
        int var43 = 18 % ((arg1 + 12) / 61);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)I", line = 322)
    private final int method2453(int arg0, int arg1) {
        field6012++;
        if (this.field6030) {
            return (class338.field4244 - arg0) / 2;
        } else {
            if (arg1 != 0) {
                this.field6018 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;B)I", line = 337)
    private final int method2454(Object arg0, String arg1, Class arg2, byte arg3) throws IllegalAccessException, NoSuchFieldException {
        int var5 = 2 / ((arg3 + 86) / 35);
        field6007++;
        Field var6 = arg2.getDeclaredField(arg1);
        return var6.getInt(arg0);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I", line = 358)
    public final int method2455(boolean arg0) {
        if (!arg0) {
            field6000 = null;
        }
        field6015++;
        return 100;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Object;)Z", line = 370)
    private final boolean method2456(Class arg0, String arg1, int arg2, Object arg3) throws IllegalAccessException, NoSuchFieldException {
        if (arg2 != -30263) {
            this.method2451(11, 111L);
        }
        field6001++;
        Field var5 = arg0.getDeclaredField(arg1);
        return var5.getBoolean(arg3);
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V", line = 389)
    private final void method2457(byte arg0) throws IllegalAccessException, NoSuchFieldException {
        field6005++;
        if (arg0 < 125) {
            return;
        }
        Class var2 = class591.field8347.getClass();
        this.field5991 = (Image) this.method2448(var2, "bar", 31024);
        this.field6011 = (Image) this.method2448(var2, "background", 31024);
        this.field6017 = (Image) this.method2448(var2, "left", 31024);
        this.field6024 = (Image) this.method2448(var2, "right", 31024);
        this.field6003 = (Image) this.method2448(var2, "top", 31024);
        this.field5999 = (Image) this.method2448(var2, "bottom", 31024);
        this.field6020 = (Image) this.method2448(var2, "bodyLeft", 31024);
        this.field5994 = (Image) this.method2448(var2, "bodyRight", 31024);
        this.field6018 = (Image) this.method2448(var2, "bodyFill", 31024);
        this.field5989 = (Font) this.method2448(var2, "bf", 31024);
        this.field6009 = (FontMetrics) this.method2448(var2, "bfm", 31024);
        this.field5996 = (Color) this.method2448(var2, "colourtext", 31024);
        Object var3 = this.method2448(var2, "lb", 31024);
        Class var4 = var3.getClass();
        this.field5990 = this.method2456(var4, "xMiddle", -30263, var3);
        this.field6030 = this.method2456(var4, "yMiddle", -30263, var3);
        this.field6006 = this.method2454(var3, "xOffset", var4, (byte) 117);
        this.field6025 = this.method2454(var3, "yOffset", var4, (byte) -124);
        this.field6028 = this.method2454(var3, "width", var4, (byte) 58);
        this.field5993 = this.method2454(var3, "height", var4, (byte) 53);
        this.field6027 = this.method2454(var3, "boxXOffset", var4, (byte) -125);
        this.field6013 = this.method2454(var3, "boxYOffset", var4, (byte) -128);
        this.field5995 = this.method2454(var3, "boxWidth", var4, (byte) 108);
        this.field6004 = this.method2454(var3, "textYOffset", var4, (byte) -18);
        this.field5998 = this.method2454(var3, "offsetPerTenCycles", var4, (byte) -122);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 440)
    public final void method2458(int arg0) {
        if (arg0 <= 1) {
            field5997 = null;
        }
        field6008++;
    }
}
