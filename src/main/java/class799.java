import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public abstract class class799 implements class323 {
   @OriginalMember(
      owner = "client!vda",
      name = "j",
      descriptor = "Z"
   )
   private boolean field11635 = false;
   @OriginalMember(
      owner = "client!vda",
      name = "k",
      descriptor = "I"
   )
   private int field11633;
   @OriginalMember(
      owner = "client!vda",
      name = "u",
      descriptor = "I"
   )
   public int field11630;
   @OriginalMember(
      owner = "client!vda",
      name = "r",
      descriptor = "Z"
   )
   private boolean field11629;
   @OriginalMember(
      owner = "client!vda",
      name = "v",
      descriptor = "Lc;"
   )
   public class652 field11637;
   @OriginalMember(
      owner = "client!vda",
      name = "e",
      descriptor = "I"
   )
   public int field11642;
   @OriginalMember(
      owner = "client!vda",
      name = "n",
      descriptor = "I"
   )
   public int field11631;
   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11644 = new String[]{method5769(method5768("L$)i-\u0012")), method5769(method5768("L$)i2\u0012")), method5769(method5768("L$)i1\u0012")), method5769(method5768("L$)i,\u0012")), method5769(method5768("L$)i6\u0012")), method5769(method5768("L$)i7\u0012")), method5769(method5768("L$)i5\u0012")), method5769(method5768("L$)i.\u0012")), method5769(method5768("L$)i0\u0012")), method5769(method5768("L$)i\u001aS.)+\u0015@%`")), method5769(method5768("L$)i4\u0012")), method5769(method5768("Anfi\u0001")), method5769(method5768("L$)i@S.!3B\u0012")), method5769(method5768("T5$+")), method5769(method5768("L$)i3\u0012"))};
   @OriginalMember(
      owner = "client!vda",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field11623 = new int[]{3, 7, 15};
   @OriginalMember(
      owner = "client!vda",
      name = "f",
      descriptor = "I"
   )
   public static int field11641 = 0;
   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "I"
   )
   public static int field11622;
   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "I"
   )
   public static int field11624;
   @OriginalMember(
      owner = "client!vda",
      name = "q",
      descriptor = "I"
   )
   public static int field11625;
   @OriginalMember(
      owner = "client!vda",
      name = "t",
      descriptor = "I"
   )
   public static int field11626;
   @OriginalMember(
      owner = "client!vda",
      name = "g",
      descriptor = "I"
   )
   public static int field11627;
   @OriginalMember(
      owner = "client!vda",
      name = "m",
      descriptor = "I"
   )
   public static int field11628;
   @OriginalMember(
      owner = "client!vda",
      name = "o",
      descriptor = "I"
   )
   public static int field11632;
   @OriginalMember(
      owner = "client!vda",
      name = "s",
      descriptor = "I"
   )
   public static int field11634;
   @OriginalMember(
      owner = "client!vda",
      name = "p",
      descriptor = "I"
   )
   public static int field11636;
   @OriginalMember(
      owner = "client!vda",
      name = "i",
      descriptor = "I"
   )
   public static int field11638;
   @OriginalMember(
      owner = "client!vda",
      name = "d",
      descriptor = "I"
   )
   public static int field11639;
   @OriginalMember(
      owner = "client!vda",
      name = "h",
      descriptor = "I"
   )
   public static int field11640;
   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "I"
   )
   public static int field11643;

   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5757(byte arg0) {
      try {
         ++field11626;
         if (this.field11637.field9737) {
            int var2 = this.method5761((byte)-105);
            this.field11637.method4792(-26367, this);
            OpenGL.glGenerateMipmapEXT(this.field11642);
            this.field11629 = true;
            this.method5762(arg0 + 10166);
            this.method5767(-112, var2);
            return true;
         } else {
            return arg0 != 75;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11644[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5758(int arg0) {
      try {
         ++field11627;
         if (~this.field11631 < -1) {
            this.field11637.method4753(this.field11631, (byte)81, this.method5761((byte)-48));
            this.field11631 = 0;
         }

         if (arg0 != 9728) {
            this.method5762(-121);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11644[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "d",
      descriptor = "(I)I"
   )
   public final int method5759(int arg0) {
      try {
         if (arg0 != 26944) {
            method5765(91);
         }

         ++field11628;
         return this.field11631;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11644[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method5760(boolean arg0, byte arg1) {
      try {
         if (!this.field11635 == arg0) {
            this.field11635 = arg0;
            this.method5762(arg1 + 10348);
         }

         ++field11636;
         if (arg1 != -107) {
            this.field11631 = -26;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11644[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field11640;
         this.method5758(9728);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11644[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "(B)I"
   )
   private final int method5761(byte arg0) {
      try {
         ++field11624;
         int var2 = this.field11637.method4754(6, this.field11630) * this.field11633;
         if (arg0 > -44) {
            field11632 = 69;
         }

         return !this.field11629 ? var2 : var2 * 4 / 3;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11644[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method5762(int arg0) {
      try {
         if (arg0 == 10241) {
            this.field11637.method4792(arg0 ^ -20224, this);
            ++field11639;
            if (this.field11635) {
               OpenGL.glTexParameteri(this.field11642, 10241, !this.field11629 ? 9729 : 9987);
               OpenGL.glTexParameteri(this.field11642, 10240, 9729);
            } else {
               OpenGL.glTexParameteri(this.field11642, 10241, this.field11629 ? 9984 : 9728);
               OpenGL.glTexParameteri(this.field11642, 10240, 9728);
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11644[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "e",
      descriptor = "(I)V"
   )
   public static final void method5763(int arg0) {
      try {
         if (arg0 >= -40) {
            field11623 = null;
         }

         class174.method1601(false);
         ++field11643;
         class532.method4095(-76);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11644[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5764(boolean arg0) {
      try {
         ++field11622;
         class425.method3371((byte)58);
         class281.field4472 = arg0;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11644[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5765(int arg0) {
      try {
         field11623 = null;
         if (arg0 != 13635) {
            method5763(36);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11644[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method5766(int arg0, boolean arg1) {
      try {
         if (this.field11629 != arg1) {
            int var3 = this.method5761((byte)-118);
            this.field11629 = true;
            this.method5762(10241);
            this.method5767(-119, var3);
         }

         ++field11634;
         int var4 = -32 / ((arg0 - 75) / 44);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11644[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method5767(int arg0, int arg1) {
      try {
         this.field11637.field9632 -= arg1;
         ++field11625;
         this.field11637.field9632 += this.method5761((byte)-99);
         if (arg0 >= -111) {
            this.method5757((byte)39);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field11644[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "<init>",
      descriptor = "(Lc;IIIZ)V"
   )
   public class799(class652 arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         this.field11633 = arg3;
         this.field11630 = arg2;
         this.field11629 = arg4;
         this.field11637 = arg0;
         this.field11642 = arg1;
         OpenGL.glGenTextures(1, class528.field8020, 0);
         this.field11631 = class528.field8020[0];
         this.method5767(-113, 0);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11644[12] + (arg0 != null ? field11644[11] : field11644[13]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1683(byte arg0);

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5768(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5769(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
