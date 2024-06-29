import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class76 implements Runnable {
   @OriginalMember(
      owner = "client!ga",
      name = "s",
      descriptor = "Lhga;"
   )
   private class196 field1008 = new class504();
   @OriginalMember(
      owner = "client!ga",
      name = "l",
      descriptor = "Lhga;"
   )
   private class196 field1017 = null;
   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1018 = new String[]{method736(method735("c\u0003;\u0005@")), method736(method735("c\u0003;\u0000@")), method736(method735("c\u0003;\n@")), method736(method735("c\u0003;\b@")), method736(method735("c\u0003;\t@")), method736(method735("\u007fL;l\u0015")), method736(method735("j\u0017y.")), method736(method735("c\u0003;\u0003@")), method736(method735("c\u0003;\u0001@")), method736(method735("c\u0003;\u0007@")), method736(method735("c\u0003;\u0004@")), method736(method735("c\u0003;\u000e@")), method736(method735("c\u0003;\u000b@")), method736(method735("c\u0003;0\u001djJ")), method736(method735("$JG'\u000bk\u0014p0\r`K5")), method736(method735("c\u0003;\u0006@"))};
   @OriginalMember(
      owner = "client!ga",
      name = "v",
      descriptor = "Laka;"
   )
   public static class418 field996 = new class418(71, 6);
   @OriginalMember(
      owner = "client!ga",
      name = "g",
      descriptor = "I"
   )
   public static int field1007 = 0;
   @OriginalMember(
      owner = "client!ga",
      name = "y",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1009 = "";
   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "I"
   )
   public static int field1000;
   @OriginalMember(
      owner = "client!ga",
      name = "f",
      descriptor = "I"
   )
   public static int field1001;
   @OriginalMember(
      owner = "client!ga",
      name = "u",
      descriptor = "I"
   )
   public static int field1002;
   @OriginalMember(
      owner = "client!ga",
      name = "m",
      descriptor = "I"
   )
   public static int field1003;
   @OriginalMember(
      owner = "client!ga",
      name = "q",
      descriptor = "I"
   )
   public static int field1005;
   @OriginalMember(
      owner = "client!ga",
      name = "o",
      descriptor = "I"
   )
   public static int field1006;
   @OriginalMember(
      owner = "client!ga",
      name = "x",
      descriptor = "I"
   )
   public static int field1010;
   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "I"
   )
   private int field1011;
   @OriginalMember(
      owner = "client!ga",
      name = "r",
      descriptor = "I"
   )
   private int field1014;
   @OriginalMember(
      owner = "client!ga",
      name = "k",
      descriptor = "I"
   )
   public static int field993;
   @OriginalMember(
      owner = "client!ga",
      name = "w",
      descriptor = "I"
   )
   public static int field994;
   @OriginalMember(
      owner = "client!ga",
      name = "t",
      descriptor = "I"
   )
   public static int field997;
   @OriginalMember(
      owner = "client!ga",
      name = "p",
      descriptor = "I"
   )
   public static int field998;
   @OriginalMember(
      owner = "client!ga",
      name = "j",
      descriptor = "I"
   )
   public static int field999;
   @OriginalMember(
      owner = "client!ga",
      name = "i",
      descriptor = "J"
   )
   private long field1012;
   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "J"
   )
   private long field1015;
   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "Loha;"
   )
   private class562 field1013;
   @OriginalMember(
      owner = "client!ga",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   private String field1016;
   @OriginalMember(
      owner = "client!ga",
      name = "h",
      descriptor = "Z"
   )
   private boolean field1004;
   @OriginalMember(
      owner = "client!ga",
      name = "n",
      descriptor = "Z"
   )
   private volatile boolean field995;

   @OriginalMember(
      owner = "client!ga",
      name = "f",
      descriptor = "(I)I"
   )
   public final int method723(int arg0) {
      try {
         if (arg0 != -488818536) {
            this.field1014 = 125;
         }

         ++field1006;
         return this.field1011;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method724(int arg0) {
      try {
         ++field994;
         this.field995 = true;
         if (arg0 != -1) {
            this.field1015 = -54L;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "d",
      descriptor = "(I)Z"
   )
   public final synchronized boolean method725(int arg0) {
      try {
         ++field999;
         if (arg0 != -24910) {
            this.method726((byte)-4);
         }

         return this.field1008.method1636(11804, this.field1015);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "run",
      descriptor = "()V"
   )
   public final void run() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method726(byte arg0) {
      try {
         ++field1005;
         if (this.field1013 == null) {
            return 0;
         } else {
            if (arg0 <= 98) {
               this.method726((byte)75);
            }

            int var2 = this.field1013.method4230(-19719);
            if (this.field1013.field8241 && ~this.field1011 > ~this.field1013.field8236) {
               return this.field1011 + 1;
            } else if (var2 >= 0 && ~var2 > ~(class161.field2056.length + -1)) {
               return ~this.field1013.field8235 == ~this.field1011 ? this.field1013.field8236 : this.field1013.field8235;
            } else {
               return 100;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1018[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "g",
      descriptor = "(I)Loha;"
   )
   public final class562 method727(int arg0) {
      try {
         if (arg0 > -90) {
            return null;
         } else {
            ++field1001;
            return this.field1013;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "(B)V"
   )
   public final synchronized void method728(byte arg0) {
      try {
         this.field1004 = true;
         if (arg0 != 23) {
            this.method727(118);
         }

         ++field993;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "c",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method729(int arg0) {
      try {
         if (arg0 != 0) {
            this.field995 = true;
         }

         ++field1010;
         return this.field1016;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "(I)J"
   )
   public final long method730(int arg0) {
      try {
         if (arg0 != 71) {
            return 121L;
         } else {
            ++field997;
            return this.field1012;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lhga;B)V"
   )
   public final synchronized void method731(class196 arg0, byte arg1) {
      try {
         ++field1003;
         if (arg1 < 119) {
            field1007 = 25;
         }

         this.field1017 = this.field1008;
         this.field1008 = arg0;
         this.field1015 = class163.method1353(-127);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1018[7] + (arg0 != null ? field1018[5] : field1018[6]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method732(int arg0) {
      try {
         if (arg0 == 0) {
            field1009 = null;
            field996 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1018[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method733(byte arg0) {
      try {
         ++field1000;
         if (arg0 <= 2) {
            this.method734((String)null, -26, 63L, -67, (class562)null);
         }

         return this.field1014;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1018[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Ljava/lang/String;IJILoha;)V"
   )
   public final synchronized void method734(String arg0, int arg1, long arg2, int arg3, class562 arg4) {
      try {
         this.field1012 = arg2;
         ++field1002;
         if (arg3 == -1) {
            this.field1011 = arg1;
            this.field1013 = arg4;
            this.field1016 = arg0;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1018[4] + (arg0 != null ? field1018[5] : field1018[6]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field1018[5] : field1018[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method735(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method736(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
