import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class204 {
   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "Llj;"
   )
   public class304 field3103 = new class304(20);
   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "Llj;"
   )
   private class304 field3116 = new class304(64);
   @OriginalMember(
      owner = "client!gm",
      name = "o",
      descriptor = "Lrr;"
   )
   public class678 field3107;
   @OriginalMember(
      owner = "client!gm",
      name = "f",
      descriptor = "Lrr;"
   )
   private class678 field3108;
   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3117 = new String[]{method1788(method1787("\u00116VXY")), method1788(method1787("\u00116V_Y")), method1788(method1787("\u00116V]Y")), method1788(method1787("\u00116VPY")), method1788(method1787("\u0018.\u0014v")), method1788(method1787("\ruV4\f")), method1788(method1787("\u00116VRY")), method1788(method1787("\u00116V&\u0018\u00182\f$Y")), method1788(method1787("\u00116V[Y")), method1788(method1787("\u00116VSY")), method1788(method1787("\u00116VYY")), method1788(method1787("\u00116V\\Y")), method1788(method1787("\u00116V^Y"))};
   @OriginalMember(
      owner = "client!gm",
      name = "g",
      descriptor = "[Lgda;"
   )
   public static class795[] field3112 = new class795[1024];
   @OriginalMember(
      owner = "client!gm",
      name = "l",
      descriptor = "I"
   )
   public static int field3102;
   @OriginalMember(
      owner = "client!gm",
      name = "j",
      descriptor = "I"
   )
   public static int field3104;
   @OriginalMember(
      owner = "client!gm",
      name = "e",
      descriptor = "I"
   )
   public static int field3105;
   @OriginalMember(
      owner = "client!gm",
      name = "m",
      descriptor = "I"
   )
   public static int field3106;
   @OriginalMember(
      owner = "client!gm",
      name = "c",
      descriptor = "I"
   )
   public static int field3109;
   @OriginalMember(
      owner = "client!gm",
      name = "n",
      descriptor = "I"
   )
   public static int field3110;
   @OriginalMember(
      owner = "client!gm",
      name = "d",
      descriptor = "I"
   )
   public static int field3111;
   @OriginalMember(
      owner = "client!gm",
      name = "i",
      descriptor = "I"
   )
   public static int field3114;
   @OriginalMember(
      owner = "client!gm",
      name = "h",
      descriptor = "I"
   )
   public static int field3115;
   @OriginalMember(
      owner = "client!gm",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field3113;

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(II)V",
      line = 6
   )
   public static final void method1777(int arg0, int arg1) {
      try {
         int var2 = 126 % ((arg1 - 61) / 46);
         ++field3109;
         class566 var3 = class146.method1321((long)arg0, 4, -1428737160);
         var3.method4268(4);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3117[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(Lrr;IIZ)Lqda;",
      line = 19
   )
   public static final class697 method1778(class678 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field3115;
         byte[] var4 = arg0.method5017(arg2, arg1, (byte)71);
         if (var4 == null) {
            return null;
         } else {
            if (!arg3) {
               method1785((byte)37, 36);
            }

            return new class697(var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3117[6] + (arg0 != null ? field3117[5] : field3117[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "(I)V",
      line = 37
   )
   public final void method1779(int arg0) {
      try {
         ++field3104;
         class304 var2 = this.field3116;
         synchronized(this.field3116) {
            this.field3116.method2554(-99);
         }

         if (arg0 > 102) {
            class304 var3 = this.field3103;
            synchronized(this.field3103) {
               this.field3103.method2554(-103);
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3117[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(ZI)V",
      line = 53
   )
   public final void method1780(boolean arg0, int arg1) {
      try {
         ++field3105;
         class304 var3 = this.field3116;
         synchronized(this.field3116) {
            this.field3116.method2552(arg1, 21533);
         }

         class304 var4 = this.field3103;
         synchronized(this.field3103) {
            if (arg0) {
               this.field3103.method2552(arg1, 21533);
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field3117[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "(II)Lwga;",
      line = 70
   )
   public final class440 method1781(int arg0, int arg1) {
      try {
         ++field3111;
         class304 var3 = this.field3116;
         class440 var4;
         synchronized(this.field3116) {
            var4 = (class440)this.field3116.method2544(false, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class678 var5 = this.field3108;
            byte[] var6;
            synchronized(this.field3108) {
               var6 = this.field3108.method5017(arg0, arg1, (byte)71);
            }

            class440 var7 = new class440();
            var7.field6772 = this;
            if (var6 != null) {
               var7.method3469((byte)-123, new class354(var6));
            }

            class304 var8 = this.field3116;
            synchronized(this.field3116) {
               this.field3116.method2545((long)arg1, arg0 + 61, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field3117[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "b",
      descriptor = "(B)V",
      line = 103
   )
   public static final void method1782(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(B)V",
      line = 121
   )
   public final void method1783(byte arg0) {
      try {
         ++field3114;
         if (arg0 > -22) {
            this.field3116 = null;
         }

         class304 var2 = this.field3116;
         synchronized(this.field3116) {
            this.field3116.method2551(true);
         }

         class304 var3 = this.field3103;
         synchronized(this.field3103) {
            this.field3103.method2551(true);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field3117[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(Lsg;I)I",
      line = 137
   )
   public static final int method1784(class742 arg0, int arg1) {
      try {
         if (arg1 != 34066) {
            method1785((byte)-110, 88);
         }

         ++field3102;
         if (class442.field6799 == arg0) {
            return 9216;
         } else if (class47.field619 != arg0) {
            if (class598.field8768 == arg0) {
               return 34066;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 34065;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3117[12] + (arg0 != null ? field3117[5] : field3117[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(BI)Z",
      line = 159
   )
   public static final boolean method1785(byte arg0, int arg1) {
      try {
         if (arg0 != 32) {
            field3113 = null;
         }

         ++field3106;
         return arg1 == 3 || arg1 == 4;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3117[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "a",
      descriptor = "(I)V",
      line = 177
   )
   public static void method1786(int arg0) {
      try {
         field3112 = null;
         if (arg0 >= 75) {
            field3113 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3117[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "<init>",
      descriptor = "(Ltv;ILrr;Lrr;)V",
      line = 200
   )
   public class204(class311 arg0, int arg1, class678 arg2, class678 arg3) {
      try {
         this.field3107 = arg3;
         this.field3108 = arg2;
         this.field3108.method4998((byte)-82, 46);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3117[7] + (arg0 != null ? field3117[5] : field3117[4]) + ',' + arg1 + ',' + (arg2 != null ? field3117[5] : field3117[4]) + ',' + (arg3 != null ? field3117[5] : field3117[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1787(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1788(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
