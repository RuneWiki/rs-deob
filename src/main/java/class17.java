import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class17 implements Runnable {
   @OriginalMember(
      owner = "client!kh",
      name = "e",
      descriptor = "Lrw;"
   )
   private class788 field297;
   @OriginalMember(
      owner = "client!kh",
      name = "k",
      descriptor = "I"
   )
   public int field312;
   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "Z"
   )
   private boolean field311;
   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "Ljava/lang/Thread;"
   )
   private Thread field314;
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field315 = new String[]{method131(method130("y\u001auzr")), method131(method130("y\u001auI/|Z")), method131(method130("7Fk")), method131(method130("4\u0004j\u0006")), method131(method130("4\u0007f")), method131(method130("7@m")), method131(method130("2\u000e{")), method131(method130("7@h")), method131(method130("7A:")), method131(method130("q\u001e2^4f\u0017)I5`\\,HeqO")), method131(method130("4\u0017f")), method131(method130("4\u0004i\u0006")), method131(method130("y\u001auyr")), method131(method130("i\\u\u0015'")), method131(method130("y\u001aurr")), method131(method130("|\u00077W")), method131(method130("y\u001au\u00073|\u001b/\u0005r")), method131(method130("y\u001au|r")), method131(method130("y\u001ausr")), method131(method130("y\u001au}r")), method131(method130("y\u001auxr")), method131(method130("y\u001auqr")), method131(method130("y\u001au\u007fr"))};
   @OriginalMember(
      owner = "client!kh",
      name = "d",
      descriptor = "Luw;"
   )
   public static class435 field300 = new class435(62, 2);
   @OriginalMember(
      owner = "client!kh",
      name = "p",
      descriptor = "Lhc;"
   )
   public static class150 field310 = new class150();
   @OriginalMember(
      owner = "client!kh",
      name = "m",
      descriptor = "I"
   )
   public static int field296;
   @OriginalMember(
      owner = "client!kh",
      name = "o",
      descriptor = "I"
   )
   public static int field298;
   @OriginalMember(
      owner = "client!kh",
      name = "g",
      descriptor = "I"
   )
   public static int field299;
   @OriginalMember(
      owner = "client!kh",
      name = "s",
      descriptor = "I"
   )
   public static int field301;
   @OriginalMember(
      owner = "client!kh",
      name = "j",
      descriptor = "I"
   )
   public static int field302;
   @OriginalMember(
      owner = "client!kh",
      name = "r",
      descriptor = "I"
   )
   public static int field303;
   @OriginalMember(
      owner = "client!kh",
      name = "h",
      descriptor = "I"
   )
   public static int field304;
   @OriginalMember(
      owner = "client!kh",
      name = "i",
      descriptor = "I"
   )
   public static int field305;
   @OriginalMember(
      owner = "client!kh",
      name = "f",
      descriptor = "I"
   )
   public static int field307;
   @OriginalMember(
      owner = "client!kh",
      name = "l",
      descriptor = "I"
   )
   public static int field308;
   @OriginalMember(
      owner = "client!kh",
      name = "q",
      descriptor = "I"
   )
   public static int field309;
   @OriginalMember(
      owner = "client!kh",
      name = "n",
      descriptor = "I"
   )
   public static int field313;
   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "Ltd;"
   )
   public static class476 field306;

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(I[BLtq;I)Lrja;"
   )
   public final class115 method120(int arg0, byte[] arg1, class653 arg2, int arg3) {
      try {
         ++field313;
         class115 var5 = new class115();
         var5.field4416 = (long)arg3;
         var5.field1860 = arg2;
         var5.field1865 = arg1;
         var5.field6321 = false;
         if (arg0 > -81) {
            method128((byte)120, 92);
         }

         var5.field1866 = 2;
         this.method125((byte)-24, var5);
         return var5;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field315[18] + arg0 + ',' + (arg1 != null ? field315[13] : field315[15]) + ',' + (arg2 != null ? field315[13] : field315[15]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method121(boolean arg0) {
      try {
         class253.field3608 = new class303[class331.field4737.method1337((byte)87)][];
         if (arg0) {
            field304 = -57;
         }

         ++field299;
         class327.field4684 = new class303[class331.field4737.method1337((byte)124)][];
         class482.field7007 = new boolean[class331.field4737.method1337((byte)82)];
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field315[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IZLtq;)Lrja;"
   )
   public final class115 method122(int param1, boolean param2, class653 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method123(int arg0) {
      try {
         this.field311 = true;
         ++field307;
         class788 var2 = this.field297;
         synchronized(this.field297) {
            int var3 = -125 % ((arg0 - 45) / 57);
            this.field297.notifyAll();
         }

         try {
            this.field314.join();
         } catch (InterruptedException var5) {
         }

         this.field314 = null;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field315[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method124(byte arg0) {
      try {
         if (arg0 != 59) {
            method126((class200)null, 118);
         }

         field306 = null;
         field300 = null;
         field310 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field315[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(BLrja;)V"
   )
   private final void method125(byte arg0, class115 arg1) {
      try {
         ++field302;
         class788 var3 = this.field297;
         synchronized(this.field297) {
            this.field297.method5681(arg1, (byte)-58);
            ++this.field312;
            if (arg0 >= -18) {
               method127((byte)72, (Throwable)null, (String)null);
            }

            this.field297.notifyAll();
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field315[22] + arg0 + ',' + (arg1 != null ? field315[13] : field315[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(Lkk;I)V"
   )
   public static final void method126(class200 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         if (arg1 == -180160504) {
            ++field303;
            int var3 = 0;
            if (var2 || var3 < class477.field6954) {
               do {
                  int var4 = class342.field4857[var3];
                  class457 var5 = class458.field6723[var4];
                  int var6 = arg0.method3564((byte)-123);
                  if (~(4 & var6) != -1) {
                     var6 += arg0.method3564((byte)-49) << 8;
                  }

                  if (~(32768 & var6) != -1) {
                     var6 += arg0.method3564((byte)-77) << 16;
                  }

                  class400.method3081(arg0, var6, var4, var5, arg1 + 180160627);
                  ++var3;
               } while(var3 < class477.field6954);

            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field315[20] + (arg0 != null ? field315[13] : field315[15]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(BLjava/lang/Throwable;Ljava/lang/String;)V"
   )
   public static final void method127(byte arg0, Throwable arg1, String arg2) {
      boolean var3 = client.field4564;
      ++field296;

      try {
         String var4 = "";
         if (arg1 != null) {
            var4 = class463.method3471(false, arg1);
         }

         if (arg2 != null) {
            if (arg1 != null) {
               var4 = var4 + field315[6];
            }

            var4 = var4 + arg2;
         }

         class686.method4999(-18234, var4);
         String var5 = class516.method3902(-122, ":", var4, field315[8]);
         String var6 = class516.method3902(-122, "@", var5, field315[2]);
         String var7 = class516.method3902(-110, "&", var6, field315[5]);
         String var8 = class516.method3902(-108, "#", var7, field315[7]);
         if (class629.field9164 == null) {
            return;
         }

         class789 var9 = class7.field74.method4785(4, new URL(class629.field9164.getCodeBase(), field315[9] + class74.field1311 + field315[4] + (class355.field5008 != null ? class355.field5008 : String.valueOf(class639.field9313)) + field315[3] + class651.field9455 + field315[11] + class651.field9436 + field315[10] + var8));
         if (var3) {
            class624.method4569((byte)98, 1L);
         }

         while(true) {
            int var10000;
            if (var9.field11542 != 0) {
               var10000 = var9.field11542;
               if (!var3) {
                  if (var10000 == 1) {
                     DataInputStream var10 = (DataInputStream)var9.field11537;
                     var10.read();
                     var10.close();
                  }
                  break;
               }
            } else {
               var10000 = 98;
            }

            class624.method4569((byte)var10000, 1L);
         }
      } catch (Exception var11) {
      }

      if (arg0 != -99) {
         method127((byte)-24, (Throwable)null, (String)null);
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method128(byte arg0, int arg1) {
      try {
         ++field308;
         if (~arg1 != 0) {
            if (class482.field7007[arg1]) {
               class331.field4737.method1344((byte)82, arg1);
               if (arg0 == 49) {
                  class253.field3608[arg1] = null;
                  class327.field4684[arg1] = null;
                  class482.field7007[arg1] = false;
               }
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field315[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "a",
      descriptor = "(IILtq;)Lrja;"
   )
   public final class115 method129(int arg0, int arg1, class653 arg2) {
      try {
         ++field309;
         class115 var4 = new class115();
         var4.field6321 = false;
         var4.field1866 = arg0;
         var4.field1860 = arg2;
         var4.field4416 = (long)arg1;
         this.method125((byte)-49, var4);
         return var4;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field315[19] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field315[13] : field315[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "<init>",
      descriptor = "(Loo;)V"
   )
   public class17(class651 arg0) {
      boolean var2 = client.field4564;
      super();
      this.field297 = new class788();
      this.field312 = 0;
      this.field311 = false;

      try {
         class789 var3 = arg0.method4792((byte)-97, 5, this);
         if (var2) {
            class624.method4569((byte)98, 10L);
         }

         while(true) {
            int var10000;
            if (var3.field11542 != 0) {
               var10000 = var3.field11542;
               if (!var2) {
                  if (var10000 == 2) {
                     throw new RuntimeException();
                  }

                  this.field314 = (Thread)var3.field11537;
                  return;
               }
            } else {
               var10000 = 98;
            }

            class624.method4569((byte)var10000, 10L);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field315[16] + (arg0 != null ? field315[13] : field315[15]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method130(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method131(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
