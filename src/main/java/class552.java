import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class552 extends class405 {
   @OriginalMember(
      owner = "client!hl",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7984 = new String[]{method4116(method4115("M\u0015LA")), method4116(method4115("\u000f\u0001\u0012")), method4116(method4115("\f\u0010\u001d")), method4116(method4115("\f\n")), method4116(method4115("\f\f\u001d")), method4116(method4115("XN\u000e\u00031")), method4116(method4115("K\f\u000e`d")), method4116(method4115("|\u0013EA*")), method4116(method4115("K\u0014T]v\fO")), method4116(method4115("\f\u0001\u001d")), method4116(method4115("\u000f\u000f")), method4116(method4115("K\f\u000egd")), method4116(method4115("V\u000eIK#Q\r\u0000[)@S\u0000]-Q\u0001M^w)\u0015ND*L\u0012M\r?B\rPA)QRd\r?@\u0005NH\u0018F\u0018\u001b'/L\u000eSYlU\u0005C\u001elO\u0015Mn#F\u0006\u0000\u0010lU\u0005C\u001ed\u0013N\u0012\u001c~\u0015L\u0000\u001db\u0014Q\u0015\u001f`\u0003P\u000e\u001d{\u0011R\t\u0016FU\u000fIIlN\u0001ICd\n@['l\u0003@\u0000[)@T\u0000N#O@\u001d\r8F\u0018TX>FRd\u0005?@\u0005NH\u0018F\u0018\f\r+O?tH4`\u000fO_(xP}\u00034ZI\u001b'l\u0003@\u0000J |&RL+`\u000fLB>\u0003]\u0000N#OJSY)SHPL>B\rS\u00034\u000f@DB8\u000b\fU@\u000fL\u0005F\u0001l@\u000fL\u0003>D\u0002\t\u0004w)\u001d*")), method4116(method4115("V\u000eIK#Q\r\u0000[)@S\u0000^8F\u0010\u001b'9M\tFB>N@SL!S\fE_~g@BL?F4EUw)\u0016OD(\u0003\rAD\"\u000bI\u0000VF*\u0016ENx\u0003\u0006RL+`\u000fL\rq\u0003\u0014EU8V\u0012E\u001f\b\u000b\u0002A^)w\u0005X\u0001lD\f\u007fy)[#OB>G;\u0010pb[\u0019\t\u0007|\rP\u0019\u001c\u007f\u001aV\u0012\u001by\u0018j)K>B\u0007cB \u0003K\u001d\r8F\u0018TX>FRd\u0005.B\u0013Ey)[L\u0000J |4EU\u000fL\u000fRI\u0017\u0013=\u000eU5\bH\r\u001cb\u0013JSY)SNXTe\nJ\u0010\u0003|\u001bX\u0015\u0015x\u0010P\u0014\u0016F*\u0006RL+`\u000fL\rg\u001e@TH4W\u0015RH~gHBL?F4EU`\u0003\u0007Lr\u0018F\u0018cB#Q\u0004{\u001d\u0011\r\u0018Y\u0006d\u0003Q\u000e\u001dfP\u0014E]b[\u0019\t\u0004f\u0013N\u0010\u0015t\u0016X\u0014\u001e|\u0017[*$*Q\u0001Gn#O@\u000b\u0010lW\u0005XY9Q\u0005\u0012idA\u0001SH\u0018F\u0018\f\r+O?tH4`\u000fO_(xP}\u00034ZK\b\u0000~\rP\n^8F\u0010\u000eU5\nI\n\u001db\u0013X\u0010\u001by\u0015Y\u0012\u0016F*\u0006RL+`\u000fL\rg\u001e@TH4W\u0015RH~gHBL?F4EU`\u0003\u0007Lr\u0018F\u0018cB#Q\u0004{\u001d\u0011\r\u0018Y\u0006d\u0003R\u000e\u001dfP\u0014E]b[\u0019\t\u0004f\u0013N\u0010\u0015|\u0015U\u0016\u0014~\u0018j)K>B\u0007cB \u0003K\u001d\r8F\u0018TX>FRd\u0005.B\u0013Ey)[L\u0000J |4EU\u000fL\u000fRI\u0017\u0013=\u000eU5\bH\r\u001eb\u0013JSY)SNXTe\nJ\u0010\u0003|\u0015X\u0019\u0015u\u0016Q\u0015\u0016F*\u0006RL+`\u000fL\rg\u001e@TH4W\u0015RH~gHBL?F4EU`\u0003\u0007Lr\u0018F\u0018cB#Q\u0004{\u001d\u0011\r\u0018Y\u0006d\u0003S\u000e\u001dfP\u0014E]b[\u0019\t\u0004f\u0013N\u0010\u001bt\u001aX\u0019\u0018}\u0016[*$*Q\u0001Gn#O@\u000b\u0010lW\u0005XY9Q\u0005\u0012idA\u0001SH\u0018F\u0018\f\r+O?tH4`\u000fO_(xP}\u00034ZK\b\u0000x\rP\n^8F\u0010\u000eU5\nI\n\u001db\u0013U\u0015\u0019\u007f\u0017V\u0013\u001aw)iF_-D#OAl\b]\u0000Y)[\u0014U_)\u0011$\bO-P\u0005tH4\u000f@GA\u0013w\u0005Xn#L\u0012Dv|~NXTg\u000b@\u0014\u0003|\t\u0013TH<\r\u0018Y\u0004e\tP\u000e\u001dy\u0016T\u0013\u0019z\u0010W\u001b'EE\u0012AJ\u000fL\f\u0000\u0006q\u0003\u0014EU8V\u0012E\u001f\b\u000b\u0002A^)w\u0005X\u0001lD\f\u007fy)[#OB>G;\u0010pb[\u0019\u000b\u0005a\u0016N\u0010\u0007?W\u0005P\u00034ZI\t\u0007|\rP\u0014\u001ct\u0017T\u0012\u001bw)iF_-D#OAl\b]\u0000Y)[\u0014U_)\u0011$\bO-P\u0005tH4\u000f@GA\u0013w\u0005Xn#L\u0012Dv|~NXTg\u000b@\u0015\u0003|\t\u0013TH<\r\u0018Y\u0004e\tP\u000e\u001dx\u0012X\u0014\u0019~\u0015[*$*Q\u0001Gn#O@\u000b\u0010lW\u0005XY9Q\u0005\u0012idA\u0001SH\u0018F\u0018\f\r+O?tH4`\u000fO_(xP}\u00034ZK\b\u0000z\rP\n^8F\u0010\u000eU5\nI\n\u001db\u0013R\u0019\u001b{\u0011P\u0012\u001ew)iF_-D#OAl\b]\u0000Y)[\u0014U_)\u0011$\bO-P\u0005tH4\u000f@GA\u0013w\u0005Xn#L\u0012Dv|~NXTg\u000b@\u0016\u0003|\t\u0013TH<\r\u0018Y\u0004e\tP\u000e\u001d~\u001aV\u0017\u001f|\u0011S\u001b'EE\u0012AJ\u000fL\f\u0000\u0006q\u0003\u0014EU8V\u0012E\u001f\b\u000b\u0002A^)w\u0005X\u0001lD\f\u007fy)[#OB>G;\u0010pb[\u0019\u000b\u0005a\u0014N\u0010\u0007?W\u0005P\u00034ZI\t\u0007|\rP\u0011\u0014{\u0015U\u0018\u001ft\u0018j)K>B\u0007cB \u0003K\u001d\r8F\u0018TX>FRd\u0005.B\u0013Ey)[L\u0000J |4EU\u000fL\u000fRI\u0017\u0013=\u000eU5\bH\u0000\u001ab\u0013JSY)SNXTe\nJ\u0010\u0003|\u0012Y\u0017\u001by\u001bR\u0018\u0016F*\u0006RL+`\u000fL\rg\u001e@TH4W\u0015RH~gHBL?F4EU`\u0003\u0007Lr\u0018F\u0018cB#Q\u0004{\u001d\u0011\r\u0018Y\u0006d\u000eX\u000e\u001dfP\u0014E]b[\u0019\t\u0004f\u0013N\u0010\u001c~\u0010V\u0019\u001c\u007f\u001a[*$*Q\u0001Gn#O@\u000b\u0010lW\u0005XY9Q\u0005\u0012idA\u0001SH\u0018F\u0018\f\r+O?tH4`\u000fO_(xP}\u00034ZK\b\rt\rP\n^8F\u0010\u000eU5\nI\n\u001db\u0013Q\u0012\u001ez\u001aQ\u0013\u0014w)iGA\u0013e\u0012AJ\u000fL\fO_l\u001e@F_-D#OAw)\u001d*")), method4116(method4115("\u0000\u0005XY)M\u0013IB\"\u0003'lr\rq\"\u007fY)[\u0014U_)|\u0012EN8B\u000eGA)\u0003Z\u0000H\"B\u0002LHFV\u000eIK#Q\r\u0000[)@S\u0000]-Q\u0001M^w)\u0015ND*L\u0012M\r?B\rPA)QRd\u007f)@\u0014\u0000^/F\u000eEy)[[*N#M\u0013T\r:F\u0003\u0013\r V\rcB)E@\u001d\r:F\u0003\u0013\u0005|\rR\u0011\u001fz\u000f@\u0010\u0003{\u0012U\u0012\u0001l\u0013N\u0010\u001a~\u0011I\u001b':L\tD\r!B\tN\u0005e\u0003\u001b*\rl\u0003@VH/\u0017@CB \u0003]\u0000Y)[\u0014U_)\u0011$rH/WHSN)M\u0005tH4\u000f@GA\u0013w\u0005Xn#L\u0012Dv|~NXTe\u0018j\u0000\rl\u0003\u0007Lr\nQ\u0001Gn#O\u000fR\rq\u0003\u0003OAfP\u0014E]dS\u0001RL!PNX\u0001lG\u000fT\u0005 V\rcB)EL\u0000N#ONRJ.\nI\u001b'1)")), method4116(method4115("\u0000\u0005XY)M\u0013IB\"\u0003'lr\rq\"\u007fY)[\u0014U_)|\u0012EN8B\u000eGA)\u0003Z\u0000H\"B\u0002LHFV\u000eIK#Q\r\u0000[)@S\u0000]-Q\u0001M^w)\u0015ND*L\u0012M\r:F\u0003\u0013\r(J\rsN-O\u0005\u001b'9M\tFB>N@SL!S\fE_~g@BA#L\rtH4\u0018jUC%E\u000fR@lP\u0001M] F\u0012\u0012i\u001eF\u0003T\r?@\u0005NH\u0018F\u0018\u001b'/L\u000eSYlU\u0005C\u001elO\u0015Mn#F\u0006\u0000\u0010lU\u0005C\u001ed\u0013N\u0012\u001c~\u0015L\u0000\u001db\u0014Q\u0015\u001f`\u0003P\u000e\u001d{\u0011R\t\u0016FU\u000fIIlN\u0001ICd\n@['E\u0003\u0016ENx\u0003\u0002LB#N#OAl\u001e@TH4W\u0015RH~gHBA#L\rtH4\u000f@GA\u0013w\u0005Xn#L\u0012Dv}~NXTe\u0018j)\r:F\u0003\u0014\r?@\u0005NH\u000fL\f\u0000\u0010lW\u0005XY9Q\u0005\u0012i\u001eF\u0003T\u0005?@\u0005NH\u0018F\u0018\f\r+O?tH4`\u000fO_(xP}\u00034ZI\u001b'E\u0003\u0006LB-W@P_)o\u0015M\rq\u0003P\u000e\u0014u\t\u0004OYdO\u0015Mn#F\u0006\f\r?@\u0005NH\u000fL\f\u000e_+AI\u000b\u001db\u0013Q\u001b'l\u0003@\u0000K L\u0001T\r<L\u0013Ta9N@\u001d\r<Q\u0005lX!\tH\u0011\u0003|\bHP_)o\u0015M\u0002<B\u0012A@?\r\u0019\t\u0004c\u000b\u0010RH\u0000V\r\u000b\u001cb\u0013I\u001b'E\u0003\u0007Lr\nQ\u0001Gn#O\u000fR\rq\u0003\u0013CH\"F#OAf\u000b\u0010O^8o\u0015M\u0002<Q\u0005lX!\nKBA#L\rcB \t\u0010A_-N\u0013\u000eUw)\u001d*")), method4116(method4115("K\f\u000end")), method4116(method4115("P\u0014E]")), method4116(method4115("A\fOB!w\u0005X")), method4116(method4115("P\u0003EC)w\u0005X")), method4116(method4115("A\u0001SH\u0018F\u0018")), method4116(method4115("S\u0001RL!P")), method4116(method4115("K\f\u000ehd")), method4116(method4115("K\f\u000ebd")), method4116(method4115("K\f\u000efd")), method4116(method4115("K\f\u000ecd")), method4116(method4115("K\f\u000eid")), method4116(method4115("K\f\u000edd")), method4116(method4115("K\f\u000eod"))};
   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "[[Z"
   )
   public static boolean[][] field7979 = new boolean[][]{{true, true, true, true, true, true, true, true, true, true, true, true, true}, {true, true, true, false, false, false, true, true, false, false, false, false, true}, {true, false, false, false, false, true, true, true, false, false, false, false, false}, {false, false, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, true, true, true, false, false, false, false, false, false, false}, {true, true, true, false, false, true, true, true, false, false, false, false, false}, {true, true, false, false, false, true, true, true, false, false, false, false, true}, {true, true, false, false, false, false, false, true, false, false, false, false, false}, {false, true, true, true, true, true, true, true, false, false, false, false, false}, {true, false, false, false, true, true, true, true, true, true, false, false, false}, {true, true, true, true, true, false, false, false, true, true, false, false, false}, {true, true, true, false, false, false, false, false, false, false, true, true, false}, new boolean[13], {true, true, true, true, true, true, true, true, true, true, true, true, true}, new boolean[13]};
   @OriginalMember(
      owner = "client!hl",
      name = "H",
      descriptor = "I"
   )
   public static int field7972 = 0;
   @OriginalMember(
      owner = "client!hl",
      name = "A",
      descriptor = "Lfd;"
   )
   public static class551 field7978 = new class551();
   @OriginalMember(
      owner = "client!hl",
      name = "K",
      descriptor = "I"
   )
   public static int field7959;
   @OriginalMember(
      owner = "client!hl",
      name = "J",
      descriptor = "I"
   )
   public static int field7961;
   @OriginalMember(
      owner = "client!hl",
      name = "D",
      descriptor = "I"
   )
   public static int field7967;
   @OriginalMember(
      owner = "client!hl",
      name = "F",
      descriptor = "I"
   )
   public static int field7969;
   @OriginalMember(
      owner = "client!hl",
      name = "w",
      descriptor = "I"
   )
   public static int field7970;
   @OriginalMember(
      owner = "client!hl",
      name = "P",
      descriptor = "I"
   )
   private int field7971;
   @OriginalMember(
      owner = "client!hl",
      name = "E",
      descriptor = "I"
   )
   private int field7973;
   @OriginalMember(
      owner = "client!hl",
      name = "O",
      descriptor = "I"
   )
   private int field7975;
   @OriginalMember(
      owner = "client!hl",
      name = "C",
      descriptor = "I"
   )
   public static int field7976;
   @OriginalMember(
      owner = "client!hl",
      name = "I",
      descriptor = "I"
   )
   private int field7977;
   @OriginalMember(
      owner = "client!hl",
      name = "Q",
      descriptor = "I"
   )
   public static int field7980;
   @OriginalMember(
      owner = "client!hl",
      name = "L",
      descriptor = "I"
   )
   public static int field7981;
   @OriginalMember(
      owner = "client!hl",
      name = "G",
      descriptor = "I"
   )
   public static int field7983;
   @OriginalMember(
      owner = "client!hl",
      name = "v",
      descriptor = "Lkv;"
   )
   private class281 field7963;
   @OriginalMember(
      owner = "client!hl",
      name = "B",
      descriptor = "Lkv;"
   )
   private class281 field7966;
   @OriginalMember(
      owner = "client!hl",
      name = "M",
      descriptor = "Lud;"
   )
   private class39 field7960;
   @OriginalMember(
      owner = "client!hl",
      name = "x",
      descriptor = "Lud;"
   )
   private class39 field7962;
   @OriginalMember(
      owner = "client!hl",
      name = "t",
      descriptor = "Lud;"
   )
   private class39 field7965;
   @OriginalMember(
      owner = "client!hl",
      name = "u",
      descriptor = "Lud;"
   )
   private class39 field7968;
   @OriginalMember(
      owner = "client!hl",
      name = "y",
      descriptor = "Lin;"
   )
   private class98 field7964;
   @OriginalMember(
      owner = "client!hl",
      name = "R",
      descriptor = "Lin;"
   )
   private class98 field7982;
   @OriginalMember(
      owner = "client!hl",
      name = "N",
      descriptor = "[Lkv;"
   )
   private class281[] field7974;

   @OriginalMember(
      owner = "client!hl",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method3112(int arg0) {
      try {
         ++field7970;
         if (arg0 != 1) {
            this.method4113(-127);
         }

         return 1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7984[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method4112(int arg0) {
      try {
         field7979 = null;
         if (arg0 == 0) {
            field7978 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7984[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method3116(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (arg2 == 32319) {
            this.field7973 = arg0;
            ++field7980;
            this.field7975 = arg1;
            int var5 = class223.method1872(this.field7973, 969328545);
            int var6 = class223.method1872(this.field7975, 969328545);
            if (this.field7971 != var5 || ~this.field7977 != ~var6) {
               if (this.field7974 != null) {
                  int var7 = 0;
                  if (var4) {
                     this.field7974[var7].method5126(arg2 ^ 22079);
                     ++var7;
                  }

                  while(true) {
                     class552 var10000;
                     if (var7 >= this.field7974.length) {
                        var10000 = this;
                        if (!var4) {
                           this.field7974 = null;
                           break;
                        }
                     } else {
                        var10000 = this;
                     }

                     var10000.field7974[var7].method5126(arg2 ^ 22079);
                     ++var7;
                  }
               }

               label159: {
                  if (~var5 < -257 || var6 > 256) {
                     int var8 = var5;
                     int var9 = var6;
                     int var10 = 0;
                     if (var4) {
                        if (~var5 < -257) {
                           var8 = var5 >> 1;
                        }

                        if (var6 > 256) {
                           var9 = var6 >> 1;
                        }

                        ++var10;
                     }

                     while(true) {
                        int var16;
                        short var10001;
                        if (var8 <= 256) {
                           var16 = var9;
                           var10001 = 256;
                           if (!var4) {
                              if (var9 <= 256) {
                                 if (this.field7964 == null) {
                                    this.field7964 = new class98(super.field5976);
                                 }

                                 this.field7974 = new class281[var10];
                                 int var11 = var5;
                                 int var12 = var6;
                                 int var13 = 0;
                                 if (var4 || ~var5 < -257 || var6 > 256) {
                                    do {
                                       this.field7974[var13++] = new class281(super.field5976, 3553, 34842, var11, var12);
                                       if (var11 > 256) {
                                          var11 >>= 1;
                                       }

                                       while(var12 > 256) {
                                          var16 = var12 >> 1;
                                          if (!var4) {
                                             var12 = var16;
                                             break;
                                          }

                                          if (var16 > 256) {
                                             var11 >>= 1;
                                          }
                                       }
                                    } while(~var11 < -257 || var12 > 256);
                                 }

                                 if (!var4) {
                                    break label159;
                                 }
                                 break;
                              }

                              var16 = ~var8;
                              var10001 = -257;
                           }
                        } else {
                           var16 = ~var8;
                           var10001 = -257;
                        }

                        if (var16 < var10001) {
                           var8 >>= 1;
                        }

                        if (var9 > 256) {
                           var9 >>= 1;
                        }

                        ++var10;
                     }
                  }

                  this.field7964 = null;
               }

               this.field7971 = var5;
               this.field7977 = var6;
            }

         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field7984[24] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "h",
      descriptor = "(I)Z"
   )
   public final boolean method4113(int arg0) {
      try {
         int var2 = 109 / ((39 - arg0) / 59);
         ++field7961;
         return super.field5976.field771 && super.field5976.field837 && super.field5976.field867;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7984[25] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method3122(byte arg0) {
      try {
         if (arg0 != -69) {
            this.field7974 = null;
         }

         ++field7967;
         return this.field7982 != null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7984[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3114(int arg0, int arg1) {
      try {
         OpenGL.glUseProgramObjectARB(0L);
         ++field7969;
         super.field5976.method259(32, 1);
         super.field5976.method252((class707)null, (byte)-11);
         super.field5976.method259(32, 0);
         int var3 = 113 / ((arg0 - 10) / 57);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7984[26] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method3118(int arg0) {
      try {
         if (arg0 < 73) {
            this.method3121(-87);
         }

         ++field7959;
         if (super.field5976.field771 && super.field5976.field837 && super.field5976.field867) {
            this.field7982 = new class98(super.field5976);
            this.field7966 = new class281(super.field5976, 3553, 34842, 256, 256);
            this.field7966.method2195(false, (byte)-59, false);
            this.field7963 = new class281(super.field5976, 3553, 34842, 256, 256);
            this.field7963.method2195(false, (byte)-59, false);
            super.field5976.method428(this.field7982, (byte)-123);
            this.field7982.method943(0, 114, this.field7966);
            this.field7982.method943(1, 116, this.field7963);
            this.field7982.method947(0, -14599);
            if (!this.field7982.method950(-4)) {
               super.field5976.method400(this.field7982, 20547);
               return false;
            } else {
               super.field5976.method400(this.field7982, 20547);
               this.field7960 = class105.method1020(new class366[]{class383.method2979(super.field5976, 12203, 35632, field7984[14])}, super.field5976, (byte)127);
               this.field7962 = class105.method1020(new class366[]{class383.method2979(super.field5976, 12203, 35632, field7984[12])}, super.field5976, (byte)116);
               this.field7968 = class105.method1020(new class366[]{class383.method2979(super.field5976, 12203, 35632, field7984[15])}, super.field5976, (byte)103);
               this.field7965 = class105.method1020(new class366[]{class383.method2979(super.field5976, 12203, 35632, field7984[13])}, super.field5976, (byte)98);
               return this.field7962 != null && this.field7960 != null && this.field7968 != null && this.field7965 != null;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7984[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(IILjava/lang/String;)Z"
   )
   public static final boolean method4114(int arg0, int arg1, String arg2) {
      boolean var3 = client.field4564;

      try {
         ++field7983;
         if (class412.field6033.field9456) {
            class101.field1674 = new class656();
            class101.field1674.field9569 = arg0;
            class101.field1674.field9570 = arg2;
            if (class628.field9136 != class409.field6010) {
               class101.field1674.field9575 = class101.field1674.field9569 + 50000;
               class101.field1674.field9580 = class101.field1674.field9569 + 40000;
            }

            int var4 = 0;
            int var10000;
            if (var3) {
               var10000 = ~arg0;
            } else if (class771.field11308.length <= var4) {
               var10000 = 1;
               if (!var3) {
                  return true;
               }
            } else {
               var10000 = ~arg0;
            }

            while(true) {
               if (var10000 == ~class771.field11308[var4].field3032) {
                  class394.field5800 = class771.field11308[var4].field9587;
               }

               ++var4;
               if (class771.field11308.length <= var4) {
                  var10000 = 1;
                  if (!var3) {
                     return true;
                  }
               } else {
                  var10000 = ~arg0;
               }
            }
         } else {
            String var5 = "";
            if (class628.field9136 != class409.field6010) {
               var5 = ":" + (arg0 + 7000);
            }

            String var6 = "";
            if (class746.field10770 != null) {
               var6 = field7984[2] + class746.field10770;
            }

            String var7 = field7984[8] + arg2 + var5 + field7984[4] + class385.field5684 + field7984[9] + class767.field11135 + var6 + field7984[3] + (class741.field10680 ? "1" : "0") + field7984[10] + (class375.field5576 ? "1" : "0") + field7984[1];
            int var8 = 104 / ((-35 - arg1) / 62);

            try {
               class490.field7150.getAppletContext().showDocument(new URL(var7), field7984[7]);
               return true;
            } catch (Exception var10) {
               return false;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field7984[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7984[5] : field7984[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "<init>",
      descriptor = "(Lrk;)V"
   )
   public class552(class35 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hl",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method3121(int arg0) {
      try {
         this.field7966 = null;
         this.field7968 = null;
         this.field7974 = null;
         this.field7963 = null;
         if (arg0 <= -2) {
            this.field7982 = null;
            this.field7962 = null;
            this.field7960 = null;
            this.field7965 = null;
            this.field7964 = null;
            ++field7976;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field7984[27] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "a",
      descriptor = "(Lkv;ILkv;I)V"
   )
   public final void method3113(class281 arg0, int arg1, class281 arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         OpenGL.glPushAttrib(2048);
         ++field7981;
         OpenGL.glMatrixMode(5889);
         OpenGL.glPushMatrix();
         OpenGL.glLoadIdentity();
         OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
         if (arg3 >= -57) {
            this.method3116(91, 70, -105);
         }

         label140: {
            if (this.field7974 == null) {
               super.field5976.method252(arg2, (byte)-51);
               super.field5976.method428(this.field7982, (byte)-124);
               this.field7982.method947(0, -14599);
               OpenGL.glViewport(0, 0, 256, 256);
               long var6 = this.field7960.field935;
               OpenGL.glUseProgramObjectARB(var6);
               OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var6, field7984[19]), 0);
               OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var6, field7984[21]), class162.field2583, 0.0F, 0.0F);
               OpenGL.glBegin(7);
               OpenGL.glTexCoord2f(0.0F, 0.0F);
               OpenGL.glVertex2i(0, 0);
               OpenGL.glTexCoord2f((float)this.field7973, 0.0F);
               OpenGL.glVertex2i(1, 0);
               OpenGL.glTexCoord2f((float)this.field7973, (float)this.field7975);
               OpenGL.glVertex2i(1, 1);
               OpenGL.glTexCoord2f(0.0F, (float)this.field7975);
               OpenGL.glVertex2i(0, 1);
               OpenGL.glEnd();
               if (!var5) {
                  break label140;
               }
            }

            int var10;
            label129: {
               super.field5976.method428(this.field7964, (byte)-114);
               int var8 = class223.method1872(this.field7973, 969328545);
               int var9 = class223.method1872(this.field7975, 969328545);
               var10 = 0;
               if (var5) {
                  OpenGL.glViewport(0, 0, var8, var9);
                  this.field7964.method943(0, 117, this.field7974[var10]);
                  if (var9 > 256) {
                     var9 >>= 1;
                  }
               } else if (~var8 >= -257) {
                  if (!var5) {
                     if (var9 <= 256) {
                        break label129;
                     }

                     OpenGL.glViewport(0, 0, var8, var9);
                     this.field7964.method943(0, 117, this.field7974[var10]);
                     if (var9 > 256) {
                        var9 >>= 1;
                     }
                  } else if (var9 > 256) {
                     var9 >>= 1;
                  }
               } else {
                  OpenGL.glViewport(0, 0, var8, var9);
                  this.field7964.method943(0, 117, this.field7974[var10]);
                  if (var9 > 256) {
                     var9 >>= 1;
                  }
               }

               while(true) {
                  if (var10 == 0) {
                     super.field5976.method252(arg2, (byte)-21);
                     OpenGL.glBegin(7);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(0, 0);
                     OpenGL.glTexCoord2f((float)this.field7973, 0.0F);
                     OpenGL.glVertex2i(1, 0);
                     OpenGL.glTexCoord2f((float)this.field7973, (float)this.field7975);
                     OpenGL.glVertex2i(1, 1);
                     OpenGL.glTexCoord2f(0.0F, (float)this.field7975);
                     OpenGL.glVertex2i(0, 1);
                     OpenGL.glEnd();
                     if (var5) {
                        super.field5976.method252(this.field7974[var10 + -1], (byte)-58);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(1.0F, 0.0F);
                        OpenGL.glVertex2i(1, 0);
                        OpenGL.glTexCoord2f(1.0F, 1.0F);
                        OpenGL.glVertex2i(1, 1);
                        OpenGL.glTexCoord2f(0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 1);
                        OpenGL.glEnd();
                        if (~var8 < -257) {
                           var8 >>= 1;
                        }

                        ++var10;
                     } else {
                        if (~var8 < -257) {
                           var8 >>= 1;
                        }

                        ++var10;
                     }
                  } else {
                     super.field5976.method252(this.field7974[var10 + -1], (byte)-58);
                     OpenGL.glBegin(7);
                     OpenGL.glTexCoord2f(0.0F, 0.0F);
                     OpenGL.glVertex2i(0, 0);
                     OpenGL.glTexCoord2f(1.0F, 0.0F);
                     OpenGL.glVertex2i(1, 0);
                     OpenGL.glTexCoord2f(1.0F, 1.0F);
                     OpenGL.glVertex2i(1, 1);
                     OpenGL.glTexCoord2f(0.0F, 1.0F);
                     OpenGL.glVertex2i(0, 1);
                     OpenGL.glEnd();
                     if (~var8 < -257) {
                        var8 >>= 1;
                     }

                     ++var10;
                  }

                  if (~var8 >= -257) {
                     if (!var5) {
                        if (var9 <= 256) {
                           break;
                        }

                        OpenGL.glViewport(0, 0, var8, var9);
                        this.field7964.method943(0, 117, this.field7974[var10]);
                        if (var9 > 256) {
                           var9 >>= 1;
                        }
                     } else if (var9 > 256) {
                        var9 >>= 1;
                     }
                  } else {
                     OpenGL.glViewport(0, 0, var8, var9);
                     this.field7964.method943(0, 117, this.field7974[var10]);
                     if (var9 > 256) {
                        var9 >>= 1;
                     }
                  }
               }
            }

            super.field5976.method400(this.field7964, 20547);
            super.field5976.method252(this.field7974[var10 + -1], (byte)-119);
            super.field5976.method428(this.field7982, (byte)-109);
            this.field7982.method947(0, -14599);
            OpenGL.glViewport(0, 0, 256, 256);
            long var11 = this.field7962.field935;
            OpenGL.glUseProgramObjectARB(var11);
            OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var11, field7984[19]), 0);
            OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var11, field7984[21]), class162.field2583, 0.0F, 0.0F);
            OpenGL.glBegin(7);
            OpenGL.glTexCoord2f(0.0F, 0.0F);
            OpenGL.glVertex2i(0, 0);
            OpenGL.glTexCoord2f(1.0F, 0.0F);
            OpenGL.glVertex2i(1, 0);
            OpenGL.glTexCoord2f(1.0F, 1.0F);
            OpenGL.glVertex2i(1, 1);
            OpenGL.glTexCoord2f(0.0F, 1.0F);
            OpenGL.glVertex2i(0, 1);
            OpenGL.glEnd();
         }

         this.field7982.method947(1, -14599);
         super.field5976.method252(this.field7966, (byte)-62);
         long var13 = this.field7965.field935;
         OpenGL.glUseProgramObjectARB(var13);
         OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var13, field7984[20]), 0);
         OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, field7984[17]), 0.00390625F, 0.0F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
         this.field7982.method947(0, -14599);
         super.field5976.method252(this.field7963, (byte)-72);
         OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var13, field7984[17]), 0.0F, 0.00390625F, 0.0F);
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2i(0, 0);
         OpenGL.glTexCoord2f(1.0F, 0.0F);
         OpenGL.glVertex2i(1, 0);
         OpenGL.glTexCoord2f(1.0F, 1.0F);
         OpenGL.glVertex2i(1, 1);
         OpenGL.glTexCoord2f(0.0F, 1.0F);
         OpenGL.glVertex2i(0, 1);
         OpenGL.glEnd();
         OpenGL.glPopAttrib();
         OpenGL.glPopMatrix();
         OpenGL.glMatrixMode(5888);
         super.field5976.method400(this.field7982, 20547);
         long var15 = this.field7968.field935;
         OpenGL.glUseProgramObjectARB(var15);
         OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, field7984[19]), 0);
         OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var15, field7984[18]), 1);
         OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var15, field7984[21]), class368.field5462, class358.field5350, 0.0F);
         super.field5976.method259(32, 1);
         super.field5976.method252(this.field7966, (byte)-13);
         super.field5976.method259(32, 0);
         super.field5976.method252(arg2, (byte)-108);
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field7984[16] + (arg0 != null ? field7984[5] : field7984[0]) + ',' + arg1 + ',' + (arg2 != null ? field7984[5] : field7984[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4115(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4116(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
