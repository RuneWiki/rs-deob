import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class491 {
   @OriginalMember(
      owner = "client!wi",
      name = "m",
      descriptor = "Ldw;"
   )
   private class748 field7263 = new class748(64);
   @OriginalMember(
      owner = "client!wi",
      name = "k",
      descriptor = "Ldw;"
   )
   public class748 field7265 = new class748(60);
   @OriginalMember(
      owner = "client!wi",
      name = "i",
      descriptor = "Leaa;"
   )
   private class526 field7264;
   @OriginalMember(
      owner = "client!wi",
      name = "l",
      descriptor = "Leaa;"
   )
   public class526 field7256;
   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7268 = new String[]{method3643(method3642("n\u0000,n ")), method3643(method3642("n\u0000,j ")), method3643(method3642("n\u0000,h ")), method3643(method3642("]\u0010lLep\n8\r")), method3643(method3642("V\naA}}\ff\u0017(^\u001bmXf}S")), method3643(method3642("V\naA}}\f\"niu\n\"ygv\u00028\r")), method3643(method3642("M\u0006vLd9&rLyl\f\"bfj\npHmwS\"")), method3643(method3642("M\u0006vLd9=pLfjIMC{z\u001bgHf#I")), method3643(method3642("l\u001a")), method3643(method3642("9(aYao\f8\r")), method3643(method3642("99kUmu\u001a8\r")), method3643(method3642("9>cAdjS\"")), method3643(method3642("V\naA}}\fp^29")), method3643(method3642("9*R^29")), method3643(method3642("w\u001cnA")), method3643(method3642("n\u0000,\u0011aw\u0000v\u0013 ")), method3643(method3642("bG,\u0003u")), method3643(method3642("n\u0000,o ")), method3643(method3642("n\u0000,e ")), method3643(method3642("n\u0000,i ")), method3643(method3642("n\u0000,l "))};
   @OriginalMember(
      owner = "client!wi",
      name = "d",
      descriptor = "Ltd;"
   )
   public static class478 field7258 = new class478(0, -1);
   @OriginalMember(
      owner = "client!wi",
      name = "o",
      descriptor = "I"
   )
   public static int field7252;
   @OriginalMember(
      owner = "client!wi",
      name = "g",
      descriptor = "I"
   )
   public static int field7253;
   @OriginalMember(
      owner = "client!wi",
      name = "f",
      descriptor = "I"
   )
   public static int field7254;
   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "I"
   )
   public static int field7255;
   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "I"
   )
   public static int field7257;
   @OriginalMember(
      owner = "client!wi",
      name = "j",
      descriptor = "I"
   )
   public static int field7259;
   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "I"
   )
   public static int field7261;
   @OriginalMember(
      owner = "client!wi",
      name = "h",
      descriptor = "I"
   )
   public static int field7262;
   @OriginalMember(
      owner = "client!wi",
      name = "n",
      descriptor = "I"
   )
   public int field7267;
   @OriginalMember(
      owner = "client!wi",
      name = "p",
      descriptor = "Leaa;"
   )
   public static class526 field7266;
   @OriginalMember(
      owner = "client!wi",
      name = "e",
      descriptor = "[Z"
   )
   public static boolean[] field7260;

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3634(int arg0, byte arg1) {
      try {
         ++field7261;
         this.field7267 = arg0;
         class748 var3 = this.field7265;
         synchronized(this.field7265) {
            this.field7265.method5451(-116);
         }

         if (arg1 >= -98) {
            this.method3634(29, (byte)55);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7268[17] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3635(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method3636(int arg0, int arg1) {
      try {
         class748 var3 = this.field7263;
         synchronized(this.field7263) {
            this.field7263.method5453(arg0, false);
         }

         ++field7254;
         class748 var4 = this.field7265;
         synchronized(this.field7265) {
            this.field7265.method5453(arg0, false);
         }

         if (arg1 != 0) {
            method3639(-4);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7268[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3637() {
      byte var0 = 10;
      byte var1 = 30;
      if (class779.field11373 != 0 && class634.field9238 != null) {
         class261.field3550.method618(class262.field3585);

         for(int var2 = 0; var2 < class2.field60.length; ++var2) {
            class261.field3550.method655(-256, class262.field3585[3] - class262.field3585[1], -92, class262.field3585[1], class68.field861[var2] + class2.field60[var2]);
         }

         for(int var3 = 0; var3 < class724.field10784; ++var3) {
            class246 var11 = class66.field819[var3];
            class261.field3550.method621(var11.field3177[0], var11.field3169[0], var11.field3180[0], class651.field9498);
            class261.field3550.method621(var11.field3177[1], var11.field3169[1], var11.field3180[1], class1.field55);
            class261.field3550.method621(var11.field3177[2], var11.field3169[2], var11.field3180[2], class789.field11471);
            class261.field3550.method621(var11.field3177[3], var11.field3169[3], var11.field3180[3], class179.field2207);
            if (class651.field9498[2] != -1 && class1.field55[2] != -1 && class789.field11471[2] != -1 && class179.field2207[2] != -1) {
               int var12 = -65536;
               if (var11.field3179 == 4) {
                  var12 = -16776961;
               }

               class261.field3550.method575(class651.field9498[1], 1, class1.field55[1], var12, class651.field9498[0], class1.field55[0]);
               class261.field3550.method575(class1.field55[1], 1, class789.field11471[1], var12, class1.field55[0], class789.field11471[0]);
               class261.field3550.method575(class789.field11471[1], 1, class179.field2207[1], var12, class789.field11471[0], class179.field2207[0]);
               class261.field3550.method575(class179.field2207[1], 1, class651.field9498[1], var12, class179.field2207[0], class651.field9498[0]);
               class261.field3550.method575(class651.field9498[1], 1, class789.field11471[1], var12, class651.field9498[0], class789.field11471[0]);
            }
         }

         class634.field9238.method678(-256, var0, -16777216, field7268[3] + class87.field1060 + "/" + 5000, var1 + 45, 0);
         class634.field9238.method678(-256, var0, -16777216, field7268[6] + class301.field4290 + "/" + 10000, var1 + 60, 0);
         class634.field9238.method678(-256, var0, -16777216, field7268[7] + class425.field6460 + "/" + 5000, var1 + 75, 0);
         class634.field9238.method678(-256, var0, -16777216, field7268[12] + (class57.field713 + class486.field7191) + field7268[9] + class724.field10784, var1 + 90, 0);
         class634.field9238.method678(-256, var0, -16777216, field7268[4] + class498.field7380 + field7268[11] + class411.field6308 + field7268[13] + class556.field8259 + field7268[10] + class171.field2123, var1 + 105, 0);
         class634.field9238.method678(-256, var0, -16777216, field7268[5] + class41.field442 / 1000L + field7268[8], var1 + 120, 0);
         if (class779.field11373 == 2 && class755.field11143 != null) {
            for(int var4 = 0; var4 < class755.field11143.length; ++var4) {
               float var6 = (float)class755.field11143[var4];
               float var7 = var6 / 4194304.0F;
               if (var7 > 1.0F) {
                  var7 = 1.0F;
               }

               float var8 = var7 * 255.0F;
               float var9 = 255.0F - var8;
               int var10 = (int)var9;
               class755.field11143[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
            }

            class396 var5 = class261.field3550.method589(class25.field261, 0, 0, class755.field11143, class25.field261, class40.field433);
            var5.method264(var0, 170, 1, 0, 0);
         }
      }

   }

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(II)Laj;"
   )
   public final class330 method3638(int arg0, int arg1) {
      try {
         ++field7255;
         class748 var3 = this.field7263;
         class330 var4;
         synchronized(this.field7263) {
            var4 = (class330)this.field7263.method5454((long)arg0, 18261);
         }

         if (var4 != null) {
            return var4;
         } else {
            int var5 = -50 % ((74 - arg1) / 42);
            class526 var6 = this.field7264;
            byte[] var7;
            synchronized(this.field7264) {
               var7 = this.field7264.method3899(-69, class645.method4654(52, arg0), class140.method1183(arg0, 78));
            }

            class330 var8 = new class330();
            var8.field4733 = this;
            var8.field4717 = arg0;
            if (var7 != null) {
               var8.method2504(new class128(var7), 31336);
            }

            class748 var9 = this.field7263;
            synchronized(this.field7263) {
               this.field7263.method5455(-2049, var8, (long)arg0);
               return var8;
            }
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7268[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3639(int arg0) {
      try {
         field7258 = null;
         field7266 = null;
         if (arg0 != 2069) {
            method3637();
         }

         field7260 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7268[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3640(int arg0) {
      try {
         ++field7252;
         class748 var2 = this.field7263;
         synchronized(this.field7263) {
            this.field7263.method5445(697465426);
            if (arg0 != 1) {
               method3639(-45);
            }
         }

         class748 var3 = this.field7265;
         synchronized(this.field7265) {
            this.field7265.method5445(697465426);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7268[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method3641(int arg0) {
      try {
         ++field7262;
         class748 var2 = this.field7263;
         synchronized(this.field7263) {
            this.field7263.method5451(-116);
         }

         int var3 = -63 % ((19 - arg0) / 48);
         class748 var4 = this.field7265;
         synchronized(this.field7265) {
            this.field7265.method5451(-120);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7268[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "<init>",
      descriptor = "(Lqo;ILeaa;Leaa;)V"
   )
   public class491(class24 arg0, int arg1, class526 arg2, class526 arg3) {
      try {
         this.field7264 = arg2;
         this.field7256 = arg3;
         int var5 = this.field7264.method3903((byte)99) - 1;
         this.field7264.method3875(0, var5);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7268[15] + (arg0 != null ? field7268[16] : field7268[14]) + ',' + arg1 + ',' + (arg2 != null ? field7268[16] : field7268[14]) + ',' + (arg3 != null ? field7268[16] : field7268[14]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
