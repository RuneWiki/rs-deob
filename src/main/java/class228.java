import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class228 extends class555 {
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2855 = new String[]{method1735(method1734("\u000fZ{\u0007ET")), method1735(method1734("\u000fZ{\u0007AT")), method1735(method1734("\u000fZ{\u0007CT")), method1735(method1734("\u000fZ{\u0007BT")), method1735(method1734("\u000fZ{\u0007GT")), method1735(method1734("\u000fZ{\u0007@T")), method1735(method1734("\u000fZ{\u0007FT"))};
   @OriginalMember(
      owner = "client!sba",
      name = "l",
      descriptor = "I"
   )
   public static int field2846;
   @OriginalMember(
      owner = "client!sba",
      name = "n",
      descriptor = "I"
   )
   public static int field2847;
   @OriginalMember(
      owner = "client!sba",
      name = "i",
      descriptor = "I"
   )
   public static int field2848;
   @OriginalMember(
      owner = "client!sba",
      name = "f",
      descriptor = "I"
   )
   public static int field2849;
   @OriginalMember(
      owner = "client!sba",
      name = "j",
      descriptor = "I"
   )
   public static int field2850;
   @OriginalMember(
      owner = "client!sba",
      name = "h",
      descriptor = "I"
   )
   public static int field2851;
   @OriginalMember(
      owner = "client!sba",
      name = "k",
      descriptor = "I"
   )
   public static int field2852;
   @OriginalMember(
      owner = "client!sba",
      name = "g",
      descriptor = "I"
   )
   public static int field2853;
   @OriginalMember(
      owner = "client!sba",
      name = "m",
      descriptor = "I"
   )
   public static int field2854;

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1730(int arg0, int arg1, int arg2, int arg3, int arg4) {
      if (class175.field2177 != null) {
         class175.field2177[arg0][arg1] = -16777216 | arg2;
      }

      if (class584.field8014 != null) {
         class584.field8014[arg0][arg1] = (short)arg3;
      }

      if (class350.field5017 != null) {
         class350.field5017[arg0][arg1] = (byte)arg4;
      }

   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = 20 % ((12 - arg1) / 47);
         ++field2849;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field2855[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class228(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1731(byte arg0) {
      try {
         ++field2847;
         if (arg0 != -107) {
            return true;
         } else if (super.field7633.method4414(0)) {
            return false;
         } else {
            return super.field7633.method4418((byte)-123) == class551.field7585;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2855[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         label30: {
            if (super.field7633.method4418((byte)-123) != class551.field7585) {
               super.field7632 = 1;
               if (!client.field4273) {
                  break label30;
               }
            }

            if (super.field7633.method4414(0)) {
               super.field7632 = 0;
            }
         }

         if (arg0 != -13712) {
            field2852 = -69;
         }

         ++field2851;
         if (super.field7632 != 0 && super.field7632 != 1) {
            super.field7632 = this.method635(127);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2855[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1732(byte arg0) {
      try {
         ++field2854;
         if (arg0 >= -61) {
            method1733(-7);
         }

         return super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2855[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         ++field2846;
         if (super.field7633.method4414(0)) {
            return 3;
         } else {
            if (arg1 < 36) {
               this.method1731((byte)55);
            }

            if (super.field7633.method4418((byte)-123) == class551.field7585) {
               if (arg0 == 0) {
                  if (super.field7633.field8436.method928((byte)-120) == 1) {
                     return 2;
                  }

                  if (~super.field7633.field8447.method4066((byte)-80) == -2) {
                     return 2;
                  }

                  if (~super.field7633.field8450.method1369((byte)-101) < -1) {
                     return 2;
                  }
               }

               return 1;
            } else {
               return 3;
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2855[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class228(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!sba",
      name = "c",
      descriptor = "(I)Z"
   )
   public static final boolean method1733(int arg0) {
      try {
         if (arg0 != 2) {
            field2852 = 41;
         }

         ++field2848;
         return ~class449.field6210 != -1;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2855[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            field2852 = 45;
         }

         ++field2850;
         return 1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2855[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1734(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1735(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
