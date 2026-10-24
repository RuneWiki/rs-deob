package deob;

@ObfuscatedName("LQLHEUAQ")
public class LQLHEUAQ {

	@ObfuscatedName("LQLHEUAQ.h")
	public int field896 = 0;

	@ObfuscatedName("LQLHEUAQ.i")
	public int field897 = 0;

	@ObfuscatedName("LQLHEUAQ.j")
	public int field898;

	@ObfuscatedName("LQLHEUAQ.k")
	public int field899;

	@ObfuscatedName("LQLHEUAQ.l")
	public int[][] field900;

	public LQLHEUAQ(int arg0, int arg1) {
		field898 = arg1;
		field899 = arg0;
		field900 = new int[field898][field899];
		method323();
	}

	@ObfuscatedName("LQLHEUAQ.a()V")
	public void method323() {
		for (int var1 = 0; var1 < field898; var1++) {
			for (int var2 = 0; var2 < field899; var2++) {
				if (var1 == 0 || var2 == 0 || field898 - 1 == var1 || field899 - 1 == var2) {
					field900[var1][var2] = 0xFFFFFF;
				} else {
					field900[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("LQLHEUAQ.a(ZIIIIZ)V")
	public void method324(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field896;
		arg4 -= field897;
		if (arg3 == 0) {
			if (arg2 == 0) {
				method327(arg1, arg4, 128);
				method327(arg1 - 1, arg4, 8);
			}

			if (arg2 == 1) {
				method327(arg1, arg4, 2);
				method327(arg1, arg4 + 1, 32);
			}

			if (arg2 == 2) {
				method327(arg1, arg4, 8);
				method327(arg1 + 1, arg4, 128);
			}

			if (arg2 == 3) {
				method327(arg1, arg4, 32);
				method327(arg1, arg4 - 1, 2);
			}
		}

		if (arg3 == 1 || arg3 == 3) {
			if (arg2 == 0) {
				method327(arg1, arg4, 1);
				method327(arg1 - 1, arg4 + 1, 16);
			}

			if (arg2 == 1) {
				method327(arg1, arg4, 4);
				method327(arg1 + 1, arg4 + 1, 64);
			}

			if (arg2 == 2) {
				method327(arg1, arg4, 16);
				method327(arg1 + 1, arg4 - 1, 1);
			}

			if (arg2 == 3) {
				method327(arg1, arg4, 64);
				method327(arg1 - 1, arg4 - 1, 4);
			}
		}

		if (arg3 == 2) {
			if (arg2 == 0) {
				method327(arg1, arg4, 130);
				method327(arg1 - 1, arg4, 8);
				method327(arg1, arg4 + 1, 32);
			}

			if (arg2 == 1) {
				method327(arg1, arg4, 10);
				method327(arg1, arg4 + 1, 32);
				method327(arg1 + 1, arg4, 128);
			}

			if (arg2 == 2) {
				method327(arg1, arg4, 40);
				method327(arg1 + 1, arg4, 128);
				method327(arg1, arg4 - 1, 2);
			}

			if (arg2 == 3) {
				method327(arg1, arg4, 160);
				method327(arg1, arg4 - 1, 2);
				method327(arg1 - 1, arg4, 8);
			}
		}

		if (arg0) {
			if (arg3 == 0) {
				if (arg2 == 0) {
					method327(arg1, arg4, 0x10000);
					method327(arg1 - 1, arg4, 4096);
				}

				if (arg2 == 1) {
					method327(arg1, arg4, 1024);
					method327(arg1, arg4 + 1, 16384);
				}

				if (arg2 == 2) {
					method327(arg1, arg4, 4096);
					method327(arg1 + 1, arg4, 0x10000);
				}

				if (arg2 == 3) {
					method327(arg1, arg4, 16384);
					method327(arg1, arg4 - 1, 1024);
				}
			}

			if (arg3 == 1 || arg3 == 3) {
				if (arg2 == 0) {
					method327(arg1, arg4, 512);
					method327(arg1 - 1, arg4 + 1, 8192);
				}

				if (arg2 == 1) {
					method327(arg1, arg4, 2048);
					method327(arg1 + 1, arg4 + 1, 32768);
				}

				if (arg2 == 2) {
					method327(arg1, arg4, 8192);
					method327(arg1 + 1, arg4 - 1, 512);
				}

				if (arg2 == 3) {
					method327(arg1, arg4, 32768);
					method327(arg1 - 1, arg4 - 1, 2048);
				}
			}

			if (arg3 == 2) {
				if (arg2 == 0) {
					method327(arg1, arg4, 66560);
					method327(arg1 - 1, arg4, 4096);
					method327(arg1, arg4 + 1, 16384);
				}

				if (arg2 == 1) {
					method327(arg1, arg4, 5120);
					method327(arg1, arg4 + 1, 16384);
					method327(arg1 + 1, arg4, 0x10000);
				}

				if (arg2 == 2) {
					method327(arg1, arg4, 20480);
					method327(arg1 + 1, arg4, 0x10000);
					method327(arg1, arg4 - 1, 1024);
				}

				if (arg2 == 3) {
					method327(arg1, arg4, 81920);
					method327(arg1, arg4 - 1, 1024);
					method327(arg1 - 1, arg4, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("LQLHEUAQ.a(IIZIIII)V")
	public void method325(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg1) {
			var7 += 0x20000;
		}

		arg4 -= field896;
		arg0 -= field897;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
			if (var9 >= 0 && var9 < field898) {
				for (int var10 = arg0; var10 < arg0 + arg5; var10++) {
					if (var10 >= 0 && var10 < field899) {
						method327(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("LQLHEUAQ.a(III)V")
	public void method326(int arg0, int arg1) {
		arg0 -= field896;
		arg1 -= field897;
		field900[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("LQLHEUAQ.b(III)V")
	public void method327(int arg0, int arg1, int arg2) {
		field900[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("LQLHEUAQ.a(ZIBIII)V")
	public void method328(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg1 -= field896;
		arg3 -= field897;
		if (arg2 == 0) {
			if (arg4 == 0) {
				method330(arg1, 128, arg3);
				method330(arg1 - 1, 8, arg3);
			}

			if (arg4 == 1) {
				method330(arg1, 2, arg3);
				method330(arg1, 32, arg3 + 1);
			}

			if (arg4 == 2) {
				method330(arg1, 8, arg3);
				method330(arg1 + 1, 128, arg3);
			}

			if (arg4 == 3) {
				method330(arg1, 32, arg3);
				method330(arg1, 2, arg3 - 1);
			}
		}

		if (arg2 == 1 || arg2 == 3) {
			if (arg4 == 0) {
				method330(arg1, 1, arg3);
				method330(arg1 - 1, 16, arg3 + 1);
			}

			if (arg4 == 1) {
				method330(arg1, 4, arg3);
				method330(arg1 + 1, 64, arg3 + 1);
			}

			if (arg4 == 2) {
				method330(arg1, 16, arg3);
				method330(arg1 + 1, 1, arg3 - 1);
			}

			if (arg4 == 3) {
				method330(arg1, 64, arg3);
				method330(arg1 - 1, 4, arg3 - 1);
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				method330(arg1, 130, arg3);
				method330(arg1 - 1, 8, arg3);
				method330(arg1, 32, arg3 + 1);
			}

			if (arg4 == 1) {
				method330(arg1, 10, arg3);
				method330(arg1, 32, arg3 + 1);
				method330(arg1 + 1, 128, arg3);
			}

			if (arg4 == 2) {
				method330(arg1, 40, arg3);
				method330(arg1 + 1, 128, arg3);
				method330(arg1, 2, arg3 - 1);
			}

			if (arg4 == 3) {
				method330(arg1, 160, arg3);
				method330(arg1, 2, arg3 - 1);
				method330(arg1 - 1, 8, arg3);
			}
		}

		if (arg0) {
			if (arg2 == 0) {
				if (arg4 == 0) {
					method330(arg1, 0x10000, arg3);
					method330(arg1 - 1, 4096, arg3);
				}

				if (arg4 == 1) {
					method330(arg1, 1024, arg3);
					method330(arg1, 16384, arg3 + 1);
				}

				if (arg4 == 2) {
					method330(arg1, 4096, arg3);
					method330(arg1 + 1, 0x10000, arg3);
				}

				if (arg4 == 3) {
					method330(arg1, 16384, arg3);
					method330(arg1, 1024, arg3 - 1);
				}
			}

			if (arg2 == 1 || arg2 == 3) {
				if (arg4 == 0) {
					method330(arg1, 512, arg3);
					method330(arg1 - 1, 8192, arg3 + 1);
				}

				if (arg4 == 1) {
					method330(arg1, 2048, arg3);
					method330(arg1 + 1, 32768, arg3 + 1);
				}

				if (arg4 == 2) {
					method330(arg1, 8192, arg3);
					method330(arg1 + 1, 512, arg3 - 1);
				}

				if (arg4 == 3) {
					method330(arg1, 32768, arg3);
					method330(arg1 - 1, 2048, arg3 - 1);
				}
			}

			if (arg2 == 2) {
				if (arg4 == 0) {
					method330(arg1, 66560, arg3);
					method330(arg1 - 1, 4096, arg3);
					method330(arg1, 16384, arg3 + 1);
				}

				if (arg4 == 1) {
					method330(arg1, 5120, arg3);
					method330(arg1, 16384, arg3 + 1);
					method330(arg1 + 1, 0x10000, arg3);
				}

				if (arg4 == 2) {
					method330(arg1, 20480, arg3);
					method330(arg1 + 1, 0x10000, arg3);
					method330(arg1, 1024, arg3 - 1);
				}

				if (arg4 == 3) {
					method330(arg1, 81920, arg3);
					method330(arg1, 1024, arg3 - 1);
					method330(arg1 - 1, 4096, arg3);
					return;
				}
			}
		}
	}

	@ObfuscatedName("LQLHEUAQ.a(IIIIIIZ)V")
	public void method329(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
		int var7 = 256;
		if (arg5) {
			var7 += 0x20000;
		}

		arg3 -= field896;
		arg1 -= field897;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg2;
			arg2 = arg4;
			arg4 = var8;
		}

		for (int var9 = arg3; var9 < arg2 + arg3; var9++) {
			if (var9 >= 0 && var9 < field898) {
				for (int var10 = arg1; var10 < arg1 + arg4; var10++) {
					if (var10 >= 0 && var10 < field899) {
						method330(var9, var7, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("LQLHEUAQ.a(IIII)V")
	public void method330(int arg0, int arg1, int arg2) {
		field900[arg0][arg2] &= 0xFFFFFF - arg1;
	}

	@ObfuscatedName("LQLHEUAQ.a(BII)V")
	public void method331(int arg0, int arg1) {
		arg1 -= field896;
		arg0 -= field897;
		field900[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("LQLHEUAQ.a(IIIIIBI)Z")
	public boolean method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg3 == arg4 && arg0 == arg1) {
			return true;
		}

		arg4 -= field896;
		arg1 -= field897;
		arg3 -= field896;
		arg0 -= field897;
		if (arg2 == 0) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1 && (field900[arg4][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1 && (field900[arg4][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 == arg4 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg3 - 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1 && (field900[arg4][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1 && (field900[arg4][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 == arg4 && arg0 - 1 == arg1) {
					return true;
				}

				if (arg3 - 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg5 == 0) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1 && (field900[arg4][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 1) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1 && (field900[arg4][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg5 == 2) {
				if (arg3 - 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1 && (field900[arg4][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1) {
					return true;
				}
			} else if (arg5 == 3) {
				if (arg3 - 1 == arg4 && arg0 == arg1) {
					return true;
				}

				if (arg3 == arg4 && arg0 + 1 == arg1 && (field900[arg4][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg3 == arg4 && arg0 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg3 == arg4 && arg0 + 1 == arg1 && (field900[arg4][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg3 == arg4 && arg0 - 1 == arg1 && (field900[arg4][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg4 && arg0 == arg1 && (field900[arg4][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("LQLHEUAQ.a(IIIIIII)Z")
	public boolean method333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg2 && arg1 == arg5) {
			return true;
		}

		arg2 -= field896;
		arg1 -= field897;
		arg0 -= field896;
		arg5 -= field897;
		if (arg4 == 6 || arg4 == 7) {
			if (arg4 == 7) {
				arg3 = arg3 + 2 & 0x3;
			}

			if (arg3 == 0) {
				if (arg0 + 1 == arg2 && arg1 == arg5 && (field900[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg1 && (field900[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 1) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (field900[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 - 1 == arg1 && (field900[arg2][arg1] & 0x2) == 0) {
					return true;
				}
			} else if (arg3 == 2) {
				if (arg0 - 1 == arg2 && arg1 == arg5 && (field900[arg2][arg1] & 0x8) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg1 && (field900[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			} else if (arg3 == 3) {
				if (arg0 + 1 == arg2 && arg1 == arg5 && (field900[arg2][arg1] & 0x80) == 0) {
					return true;
				}

				if (arg0 == arg2 && arg5 + 1 == arg1 && (field900[arg2][arg1] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg4 == 8) {
			if (arg0 == arg2 && arg5 + 1 == arg1 && (field900[arg2][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg2 && arg5 - 1 == arg1 && (field900[arg2][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg0 - 1 == arg2 && arg1 == arg5 && (field900[arg2][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg0 + 1 == arg2 && arg1 == arg5 && (field900[arg2][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("LQLHEUAQ.a(IIIIIZII)Z")
	public boolean method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg1 - 1;
		int var9 = arg2 + arg4 - 1;
		if (arg6 >= arg0 && arg6 <= var8 && arg3 >= arg4 && arg3 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg3 >= arg4 && arg3 <= var9 && (field900[arg6 - field896][arg3 - field897] & 0x8) == 0 && (arg5 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg3 >= arg4 && arg3 <= var9 && (field900[arg6 - field896][arg3 - field897] & 0x80) == 0 && (arg5 & 0x2) == 0) {
			return true;
		}

		if (arg4 - 1 == arg3 && arg6 >= arg0 && arg6 <= var8 && (field900[arg6 - field896][arg3 - field897] & 0x2) == 0 && (arg5 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg3 && arg6 >= arg0 && arg6 <= var8 && (field900[arg6 - field896][arg3 - field897] & 0x20) == 0 && (arg5 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
