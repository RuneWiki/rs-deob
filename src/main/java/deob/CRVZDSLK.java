package deob;

@ObfuscatedName("CRVZDSLK")
public class CRVZDSLK {

	@ObfuscatedName("CRVZDSLK.k")
	public int field501 = 0;

	@ObfuscatedName("CRVZDSLK.l")
	public int field502 = 0;

	@ObfuscatedName("CRVZDSLK.m")
	public int field503;

	@ObfuscatedName("CRVZDSLK.n")
	public int field504;

	@ObfuscatedName("CRVZDSLK.o")
	public int[][] field505;

	public CRVZDSLK(int arg0, int arg1) {
		field503 = arg1;
		field504 = arg0;
		field505 = new int[field503][field504];
		method157();
	}

	@ObfuscatedName("CRVZDSLK.a()V")
	public void method157() {
		for (int var1 = 0; var1 < field503; var1++) {
			for (int var2 = 0; var2 < field504; var2++) {
				if (var1 == 0 || var2 == 0 || field503 - 1 == var1 || field504 - 1 == var2) {
					field505[var1][var2] = 0xFFFFFF;
				} else {
					field505[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("CRVZDSLK.a(IZBIII)V")
	public void method158(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg4 -= field501;
		arg2 -= field502;
		if (arg3 == 0) {
			if (arg0 == 0) {
				method161(arg4, arg2, 128);
				method161(arg4 - 1, arg2, 8);
			}

			if (arg0 == 1) {
				method161(arg4, arg2, 2);
				method161(arg4, arg2 + 1, 32);
			}

			if (arg0 == 2) {
				method161(arg4, arg2, 8);
				method161(arg4 + 1, arg2, 128);
			}

			if (arg0 == 3) {
				method161(arg4, arg2, 32);
				method161(arg4, arg2 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg0 == 0) {
				method161(arg4, arg2, 1);
				method161(arg4 - 1, arg2 + 1, 16);
			}

			if (arg0 == 1) {
				method161(arg4, arg2, 4);
				method161(arg4 + 1, arg2 + 1, 64);
			}

			if (arg0 == 2) {
				method161(arg4, arg2, 16);
				method161(arg4 + 1, arg2 - 1, 1);
			}

			if (arg0 == 3) {
				method161(arg4, arg2, 64);
				method161(arg4 - 1, arg2 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg0 == 0) {
				method161(arg4, arg2, 130);
				method161(arg4 - 1, arg2, 8);
				method161(arg4, arg2 + 1, 32);
			}

			if (arg0 == 1) {
				method161(arg4, arg2, 10);
				method161(arg4, arg2 + 1, 32);
				method161(arg4 + 1, arg2, 128);
			}

			if (arg0 == 2) {
				method161(arg4, arg2, 40);
				method161(arg4 + 1, arg2, 128);
				method161(arg4, arg2 - 1, 2);
			}

			if (arg0 == 3) {
				method161(arg4, arg2, 160);
				method161(arg4, arg2 - 1, 2);
				method161(arg4 - 1, arg2, 8);
			}
		}

		if (arg1) {
			if (arg3 == 0) {
				if (arg0 == 0) {
					method161(arg4, arg2, 0x10000);
					method161(arg4 - 1, arg2, 4096);
				}

				if (arg0 == 1) {
					method161(arg4, arg2, 1024);
					method161(arg4, arg2 + 1, 16384);
				}

				if (arg0 == 2) {
					method161(arg4, arg2, 4096);
					method161(arg4 + 1, arg2, 0x10000);
				}

				if (arg0 == 3) {
					method161(arg4, arg2, 16384);
					method161(arg4, arg2 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg0 == 0) {
					method161(arg4, arg2, 512);
					method161(arg4 - 1, arg2 + 1, 8192);
				}

				if (arg0 == 1) {
					method161(arg4, arg2, 2048);
					method161(arg4 + 1, arg2 + 1, 32768);
				}

				if (arg0 == 2) {
					method161(arg4, arg2, 8192);
					method161(arg4 + 1, arg2 - 1, 512);
				}

				if (arg0 == 3) {
					method161(arg4, arg2, 32768);
					method161(arg4 - 1, arg2 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg0 == 0) {
					method161(arg4, arg2, 66560);
					method161(arg4 - 1, arg2, 4096);
					method161(arg4, arg2 + 1, 16384);
				}

				if (arg0 == 1) {
					method161(arg4, arg2, 5120);
					method161(arg4, arg2 + 1, 16384);
					method161(arg4 + 1, arg2, 0x10000);
				}

				if (arg0 == 2) {
					method161(arg4, arg2, 20480);
					method161(arg4 + 1, arg2, 0x10000);
					method161(arg4, arg2 - 1, 1024);
				}

				if (arg0 == 3) {
					method161(arg4, arg2, 81920);
					method161(arg4, arg2 - 1, 1024);
					method161(arg4 - 1, arg2, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("CRVZDSLK.a(IIIIIZI)V")
	public void method159(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg0 -= field501;
		arg5 -= field502;

		if (arg1 == 1 || arg1 == 3) {
			int var8 = arg2;
			arg2 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg0; var9 < arg0 + arg2; var9++) {
			if (var9 >= 0 && var9 < field503) {
				for (int var10 = arg5; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field504) {
						method161(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("CRVZDSLK.a(III)V")
	public void method160(int arg0, int arg1) {
		arg0 -= field501;
		arg1 -= field502;
		field505[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("CRVZDSLK.b(III)V")
	public void method161(int arg0, int arg1, int arg2) {
		field505[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("CRVZDSLK.a(ZIZIII)V")
	public void method162(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field501;
		arg1 -= field502;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method164(arg3, 128, arg1);
				method164(arg3 - 1, 8, arg1);
			}

			if (arg2 == 1) {
				method164(arg3, 2, arg1);
				method164(arg3, 32, arg1 + 1);
			}

			if (arg2 == 2) {
				method164(arg3, 8, arg1);
				method164(arg3 + 1, 128, arg1);
			}

			if (arg2 == 3) {
				method164(arg3, 32, arg1);
				method164(arg3, 2, arg1 - 1);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method164(arg3, 1, arg1);
				method164(arg3 - 1, 16, arg1 + 1);
			}

			if (arg2 == 1) {
				method164(arg3, 4, arg1);
				method164(arg3 + 1, 64, arg1 + 1);
			}

			if (arg2 == 2) {
				method164(arg3, 16, arg1);
				method164(arg3 + 1, 1, arg1 - 1);
			}

			if (arg2 == 3) {
				method164(arg3, 64, arg1);
				method164(arg3 - 1, 4, arg1 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method164(arg3, 130, arg1);
				method164(arg3 - 1, 8, arg1);
				method164(arg3, 32, arg1 + 1);
			}

			if (arg2 == 1) {
				method164(arg3, 10, arg1);
				method164(arg3, 32, arg1 + 1);
				method164(arg3 + 1, 128, arg1);
			}

			if (arg2 == 2) {
				method164(arg3, 40, arg1);
				method164(arg3 + 1, 128, arg1);
				method164(arg3, 2, arg1 - 1);
			}

			if (arg2 == 3) {
				method164(arg3, 160, arg1);
				method164(arg3, 2, arg1 - 1);
				method164(arg3 - 1, 8, arg1);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method164(arg3, 0x10000, arg1);
					method164(arg3 - 1, 4096, arg1);
				}

				if (arg2 == 1) {
					method164(arg3, 1024, arg1);
					method164(arg3, 16384, arg1 + 1);
				}

				if (arg2 == 2) {
					method164(arg3, 4096, arg1);
					method164(arg3 + 1, 0x10000, arg1);
				}

				if (arg2 == 3) {
					method164(arg3, 16384, arg1);
					method164(arg3, 1024, arg1 - 1);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method164(arg3, 512, arg1);
					method164(arg3 - 1, 8192, arg1 + 1);
				}

				if (arg2 == 1) {
					method164(arg3, 2048, arg1);
					method164(arg3 + 1, 32768, arg1 + 1);
				}

				if (arg2 == 2) {
					method164(arg3, 8192, arg1);
					method164(arg3 + 1, 512, arg1 - 1);
				}

				if (arg2 == 3) {
					method164(arg3, 32768, arg1);
					method164(arg3 - 1, 2048, arg1 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method164(arg3, 66560, arg1);
					method164(arg3 - 1, 4096, arg1);
					method164(arg3, 16384, arg1 + 1);
				}

				if (arg2 == 1) {
					method164(arg3, 5120, arg1);
					method164(arg3, 16384, arg1 + 1);
					method164(arg3 + 1, 0x10000, arg1);
				}

				if (arg2 == 2) {
					method164(arg3, 20480, arg1);
					method164(arg3 + 1, 0x10000, arg1);
					method164(arg3, 1024, arg1 - 1);
				}

				if (arg2 == 3) {
					method164(arg3, 81920, arg1);
					method164(arg3, 1024, arg1 - 1);
					method164(arg3 - 1, 4096, arg1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("CRVZDSLK.a(IZIIIII)V")
	public void method163(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg3 -= field501;
		arg0 -= field502;

		if (arg2 == 1 || arg2 == 3) {
			int var8 = arg4;
			arg4 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg3; var9 < arg3 + arg4; var9++) {
			if (var9 >= 0 && var9 < field503) {
				for (int var10 = arg0; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < field504) {
						method164(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("CRVZDSLK.a(IIZI)V")
	public void method164(int arg0, int arg1, int arg2) {
		field505[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("CRVZDSLK.c(III)V")
	public void method165(int arg0, int arg1) {
		arg1 -= field501;
		arg0 -= field502;
		field505[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("CRVZDSLK.a(IIIIIII)Z")
	public boolean method166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg4 && arg0 == arg3) {
			return true;
		}

		arg2 -= field501;
		arg3 -= field502;
		arg4 -= field501;
		arg0 -= field502;
		if (arg5 == 0) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg2 && arg0 == arg3) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg3 && (field505[arg2][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg3 && (field505[arg2][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg2 == arg4 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 + 1 == arg2 && arg0 == arg3) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg3 && (field505[arg2][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg3 && (field505[arg2][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg2 == arg4 && arg0 - 1 == arg3) {
					return true;
				}

				if (arg4 - 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg1 == 0) {
				if (arg4 - 1 == arg2 && arg0 == arg3) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg3 && (field505[arg2][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg3) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg3) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg3 && (field505[arg2][arg3] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280108) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg3 && (field505[arg2][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg3) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg3) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 - 1 == arg2 && arg0 == arg3) {
					return true;
				}

				if (arg2 == arg4 && arg0 + 1 == arg3 && (field505[arg2][arg3] & 0x1280120) == 0) {
					return true;
				}

				if (arg4 + 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x1280180) == 0) {
					return true;
				}

				if (arg2 == arg4 && arg0 - 1 == arg3) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg2 == arg4 && arg0 + 1 == arg3 && (field505[arg2][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg4 && arg0 - 1 == arg3 && (field505[arg2][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg2 && arg0 == arg3 && (field505[arg2][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CRVZDSLK.b(IIIIIII)Z")
	public boolean method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg4 && arg2 == arg5) {
			return true;
		}

		arg0 -= field501;
		arg5 -= field502;
		arg4 -= field501;
		arg2 -= field502;
		if (arg3 == 6 || arg3 == 7) {
			if (arg3 == 7) {
				arg1 = arg1 + 2 & 0x3;
			}

			if (arg1 == 0) {
				if (arg4 + 1 == arg0 && arg2 == arg5 && (field505[arg0][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg5 && (field505[arg0][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 1) {
				if (arg4 - 1 == arg0 && arg2 == arg5 && (field505[arg0][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 - 1 == arg5 && (field505[arg0][arg5] & 0x2) == 0) {
					return true;
				}
			} else if (arg1 == 2) {
				if (arg4 - 1 == arg0 && arg2 == arg5 && (field505[arg0][arg5] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg5 && (field505[arg0][arg5] & 0x20) == 0) {
					return true;
				}
			} else if (arg1 == 3) {
				if (arg4 + 1 == arg0 && arg2 == arg5 && (field505[arg0][arg5] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg4 && arg2 + 1 == arg5 && (field505[arg0][arg5] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg3 == 8) {
			if (arg0 == arg4 && arg2 + 1 == arg5 && (field505[arg0][arg5] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg4 && arg2 - 1 == arg5 && (field505[arg0][arg5] & 0x2) == 0) {
				return true;
			}

			if (arg4 - 1 == arg0 && arg2 == arg5 && (field505[arg0][arg5] & 0x8) == 0) {
				return true;
			}

			if (arg4 + 1 == arg0 && arg2 == arg5 && (field505[arg0][arg5] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("CRVZDSLK.a(IIIIBIII)Z")
	public boolean method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg3 + arg5 - 1;
		int var9 = arg2 + arg6 - 1;
		if (arg1 >= arg3 && arg1 <= var8 && arg0 >= arg2 && arg0 <= var9) {
			return true;
		}

		if (arg3 - 1 == arg1 && arg0 >= arg2 && arg0 <= var9 && (field505[arg1 - field501][arg0 - field502] & 0x8) == 0 && (arg4 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg1 && arg0 >= arg2 && arg0 <= var9 && (field505[arg1 - field501][arg0 - field502] & 0x80) == 0 && (arg4 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg0 && arg1 >= arg3 && arg1 <= var8 && (field505[arg1 - field501][arg0 - field502] & 0x2) == 0 && (arg4 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg0 && arg1 >= arg3 && arg1 <= var8 && (field505[arg1 - field501][arg0 - field502] & 0x20) == 0 && (arg4 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
