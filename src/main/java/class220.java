import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class220 {
   @OriginalMember(
      owner = "client!dga",
      name = "r",
      descriptor = "Loi;"
   )
   private class80 field3137 = new class80(64);
   @OriginalMember(
      owner = "client!dga",
      name = "k",
      descriptor = "Loi;"
   )
   public class80 field3151 = new class80(50);
   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "Loi;"
   )
   public class80 field3152 = new class80(5);
   @OriginalMember(
      owner = "client!dga",
      name = "s",
      descriptor = "Lkf;"
   )
   private class266 field3136;
   @OriginalMember(
      owner = "client!dga",
      name = "p",
      descriptor = "Lkf;"
   )
   public class266 field3150;
   @OriginalMember(
      owner = "client!dga",
      name = "j",
      descriptor = "Lno;"
   )
   public class732 field3135;
   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "Z"
   )
   public boolean field3142;
   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3154 = new String[]{method1738(method1737("t;_;\\8")), method1738(method1737("t;_;X8")), method1738(method1737("t;_;&y2Wa$8")), method1738(method1737("kr\u0010;g")), method1738(method1737("~)Ry")), method1738(method1737("t;_;Y8")), method1738(method1737("t;_;]8")), method1738(method1737("t;_;[8")), method1738(method1737("t;_;R8")), method1738(method1737("t;_;_8")), method1738(method1737("t;_;^8"))};
   @OriginalMember(
      owner = "client!dga",
      name = "i",
      descriptor = "Loi;"
   )
   public static class80 field3139 = new class80(32);
   @OriginalMember(
      owner = "client!dga",
      name = "g",
      descriptor = "I"
   )
   public static int field3134;
   @OriginalMember(
      owner = "client!dga",
      name = "e",
      descriptor = "I"
   )
   public static int field3138;
   @OriginalMember(
      owner = "client!dga",
      name = "d",
      descriptor = "I"
   )
   public static int field3140;
   @OriginalMember(
      owner = "client!dga",
      name = "t",
      descriptor = "I"
   )
   public static int field3141;
   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "I"
   )
   public static int field3143;
   @OriginalMember(
      owner = "client!dga",
      name = "l",
      descriptor = "I"
   )
   public static int field3144;
   @OriginalMember(
      owner = "client!dga",
      name = "f",
      descriptor = "I"
   )
   public static int field3146;
   @OriginalMember(
      owner = "client!dga",
      name = "n",
      descriptor = "I"
   )
   public static int field3147;
   @OriginalMember(
      owner = "client!dga",
      name = "o",
      descriptor = "I"
   )
   public static int field3149;
   @OriginalMember(
      owner = "client!dga",
      name = "h",
      descriptor = "I"
   )
   public int field3153;
   @OriginalMember(
      owner = "client!dga",
      name = "q",
      descriptor = "Lclient;"
   )
   public static client field3148;
   @OriginalMember(
      owner = "client!dga",
      name = "m",
      descriptor = "[Lji;"
   )
   public static class637[] field3145;

   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "(I)V",
      line = 4
   )
   public final void method1729(int arg0) {
      try {
         ++field3146;
         class80 var2 = this.field3151;
         synchronized(this.field3151) {
            this.field3151.method731(arg0 ^ 32);
         }

         class80 var3 = this.field3152;
         synchronized(this.field3152) {
            this.field3152.method731(arg0 ^ arg0);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3154[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "(I)V",
      line = 20
   )
   public final void method1730(int arg0) {
      try {
         class80 var2 = this.field3137;
         synchronized(this.field3137) {
            if (arg0 < 38) {
               method1734((byte)11);
            }

            this.field3137.method731(0);
         }

         ++field3134;
         class80 var3 = this.field3151;
         synchronized(this.field3151) {
            this.field3151.method731(0);
         }

         class80 var4 = this.field3152;
         synchronized(this.field3152) {
            this.field3152.method731(0);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3154[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(ZB)V",
      line = 41
   )
   public final void method1731(boolean arg0, byte arg1) {
      try {
         ++field3140;
         if (!this.field3142 != !arg0) {
            if (arg1 <= 92) {
               this.method1733(114, -124);
            }

            this.field3142 = arg0;
            this.method1730(98);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3154[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "c",
      descriptor = "(II)Lnea;",
      line = 60
   )
   public final class745 method1732(int arg0, int arg1) {
      try {
         ++field3149;
         class80 var3 = this.field3137;
         class745 var4;
         synchronized(this.field3137) {
            var4 = (class745)this.field3137.method725(0, (long)arg1);
         }

         if (var4 != null) {
            return var4;
         } else {
            if (arg0 != 11268) {
               field3144 = 104;
            }

            class266 var5 = this.field3136;
            byte[] var6;
            synchronized(this.field3136) {
               var6 = this.field3136.method2037(false, class116.method933(arg1, 127), class608.method4429(arg0 ^ 1057699011, arg1));
            }

            class745 var7 = new class745();
            var7.field10886 = this;
            var7.field10873 = arg1;
            if (var6 != null) {
               var7.method5397(new class147(var6), (byte)-11);
            }

            var7.method5399(11);
            class80 var8 = this.field3137;
            synchronized(this.field3137) {
               this.field3137.method723(arg0 ^ 11268, (long)arg1, var7);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field3154[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(II)V",
      line = 93
   )
   public final void method1733(int arg0, int arg1) {
      try {
         class80 var3 = this.field3137;
         synchronized(this.field3137) {
            this.field3137.method726(arg0, 25324);
         }

         ++field3141;
         class80 var4 = this.field3151;
         synchronized(this.field3151) {
            this.field3151.method726(arg0, 25324);
            if (arg1 != -2157) {
               this.field3136 = null;
            }
         }

         class80 var5 = this.field3152;
         synchronized(this.field3152) {
            this.field3152.method726(arg0, arg1 + 27481);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field3154[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(B)V",
      line = 113
   )
   public static void method1734(byte arg0) {
      try {
         field3145 = null;
         field3139 = null;
         int var1 = -28 / ((arg0 - 39) / 34);
         field3148 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3154[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "b",
      descriptor = "(II)V",
      line = 125
   )
   public final void method1735(int arg0, int arg1) {
      try {
         ++field3147;
         this.field3153 = arg1;
         class80 var3 = this.field3151;
         synchronized(this.field3151) {
            this.field3151.method731(0);
         }

         class80 var4 = this.field3152;
         synchronized(this.field3152) {
            this.field3152.method731(0);
            if (arg0 != -4874) {
               this.method1733(-16, 38);
            }

         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3154[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "a",
      descriptor = "(I)V",
      line = 150
   )
   public final void method1736(int arg0) {
      try {
         class80 var2 = this.field3137;
         synchronized(this.field3137) {
            this.field3137.method715(true);
         }

         ++field3143;
         if (arg0 == 5) {
            class80 var3 = this.field3151;
            synchronized(this.field3151) {
               this.field3151.method715(true);
            }

            class80 var4 = this.field3152;
            synchronized(this.field3152) {
               this.field3152.method715(true);
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field3154[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "<init>",
      descriptor = "(Lno;IZLkf;Lkf;)V",
      line = 182
   )
   public class220(class732 arg0, int arg1, boolean arg2, class266 arg3, class266 arg4) {
      try {
         this.field3136 = arg3;
         this.field3150 = arg4;
         this.field3135 = arg0;
         this.field3142 = arg2;
         if (this.field3136 != null) {
            int var6 = this.field3136.method2027((byte)-109) - 1;
            this.field3136.method2060(2, var6);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3154[2] + (arg0 != null ? field3154[3] : field3154[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3154[3] : field3154[4]) + ',' + (arg4 != null ? field3154[3] : field3154[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1737(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1738(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
